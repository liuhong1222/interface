package main.java.cn.hhtp.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wangqiang
 * @since 2018/6/30
 */
public class HttpUtils {
    private static final Logger        log              = LoggerFactory.getLogger(HttpUtils.class);

    private static final int           REQUEST_TIMEOUT  = 10 * 1000;                                 // 设置请求超时

    private static final int           CONNECT_TIMEOUT  = 5 * 1000;                                 // 连接超时时间

    private static final int           SO_TIMEOUT       = 20 * 1000;                                // 数据传输超时

    private static final Charset       DEFAULT_CHARTSET = ContentType.APPLICATION_JSON.getCharset(); //utf8

    // 务必单例
    private static CloseableHttpClient client;

    static {
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT)
                .setConnectionRequestTimeout(REQUEST_TIMEOUT).setSocketTimeout(SO_TIMEOUT).build();
        client = HttpClients.custom().setDefaultRequestConfig(requestConfig).setMaxConnTotal(300)
                .build();
    }


    public static String get(String url, Map<String, String> paramsMap) {
        return send(RequestBuilder.get(url), paramsMap);
    }


    public static String post(String url, Map<String, String> paramsMap) {
        return send(RequestBuilder.post(url), paramsMap);
    }


    public static String postJson(String url, String json) {
        final RequestBuilder postBuilder = RequestBuilder.post(url);
        postBuilder.setCharset(DEFAULT_CHARTSET);
        final StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
        //        entity.setContentEncoding(DEFAULT_CHARTSET);
        //        entity.setContentType("application/json");
        postBuilder.setEntity(entity);
        return send0(postBuilder);
    }

    public static String postJsonMap(String url, String json) {
        final RequestBuilder postBuilder = RequestBuilder.post(url);
        postBuilder.setCharset(DEFAULT_CHARTSET);
        final StringEntity entity = new StringEntity(json, ContentType.APPLICATION_FORM_URLENCODED);
        entity.setContentEncoding("UTF-8");
        //        entity.setContentType("application/json");
        postBuilder.setEntity(entity);
        return send0(postBuilder);
    }


    /**
     * chenzj
     */
    public static String postJsonObjectWithFormData(String url, JSONObject jsonObject) {
        ContentType applicationFormUrlencoded = ContentType.create("application/x-www-form-urlencoded", Consts.UTF_8);
        MultipartEntityBuilder meBuilder = MultipartEntityBuilder.create();
        Set<String> iterator = jsonObject.keySet();
        Iterator<String> it = iterator.iterator();
        // 设置参数
        while (it.hasNext()) {
            String key = (String) it.next();
            String value = jsonObject.getString(key);
            StringBody comment = new StringBody(value, applicationFormUrlencoded);
            meBuilder.addPart(key, comment);
        }
        HttpEntity reqEntity = meBuilder.setCharset(DEFAULT_CHARTSET).build();
        final RequestBuilder postBuilder = RequestBuilder.post(url);
        postBuilder.setCharset(DEFAULT_CHARTSET);
        postBuilder.setEntity(reqEntity);
        return send0(postBuilder);
    }

    private static String send(RequestBuilder requestBuilder, Map<String, String> paramsMap) {
        requestBuilder.setCharset(DEFAULT_CHARTSET);

        if (paramsMap != null) {
            for (Map.Entry<String, String> param : paramsMap.entrySet()) {
                requestBuilder.addParameter(param.getKey(), param.getValue());
            }
        }
        return send0(requestBuilder);
    }


    private static String send0(final RequestBuilder requestBuilder) {
        String responseText = null;
        CloseableHttpResponse response = null;
        try {
            response = client.execute(requestBuilder.build());
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                org.apache.http.HttpEntity entity = response.getEntity();
                if (entity != null) {
                    responseText = EntityUtils.toString(entity, DEFAULT_CHARTSET);
                }
            }
        } catch (Exception e) {
            log.error("", e);
        } finally {
            try {
                response.close();
            } catch (Exception e) {
                log.warn("", e);
            }
        }
        return responseText;
    }
}
