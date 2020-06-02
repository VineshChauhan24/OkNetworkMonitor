package com.linkaipeng.oknetworkmonitor.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by linkaipeng on 2018/5/17.
 */

public class NetworkFeedModel implements Serializable {

    public static final String CALL_START = "callStart";
    public static final String CALL_END = "callEnd";

    public static final String DNS_START = "dnsStart";
    public static final String DNS_END = "dnsEnd";
    public static final String CONNECT_START = "connectStart";
    public static final String SECURE_CONNECT_START = "secureConnectStart";
    public static final String SECURE_CONNECT_END = "secureConnectEnd";
    public static final String CONNECT_END = "connectEnd";

    public static final String REQUEST_BODY_START = "requestBodyStart";
    public static final String REQUEST_BODY_END = "requestBodyEnd";
    public static final String REQUEST_HEADERS_START = "requestHeadersStart";
    public static final String REQUEST_HEADERS_END = "requestHeadersEnd";

    public static final String RESPONSE_HEADERS_START = "responseHeadersStart";
    public static final String RESPONSE_HEADERS_END = "responseHeadersEnd";
    public static final String RESPONSE_BODY_START = "responseBodyStart";
    public static final String RESPONSE_BODY_END = "responseBodyEnd";

    private String mRequestId;
    private String mUrl;
    private String mHost;
    private String mMethod;
    private Map<String, String> mRequestHeadersMap;

    private String mName;
    private int mStatus;
    private int mSize;
    private long mCostTime;
    private String mContentType;
    private String mBody;
    private Map<String, String> mResponseHeadersMap;

    private long mCreateTime;

    private String mCURL;

    private Map<String, Long> mNetworkEventMap = new HashMap<>();

    public String getRequestId() {
        return mRequestId;
    }

    public void setRequestId(String requestId) {
        mRequestId = requestId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getHost() {
        return mHost;
    }

    public void setHost(String host) {
        mHost = host;
    }

    public String getMethod() {
        return mMethod;
    }

    public void setMethod(String method) {
        mMethod = method;
    }

    public Map<String, String> getRequestHeadersMap() {
        if (mRequestHeadersMap == null) {
            mRequestHeadersMap = new HashMap<>();
        }
        return mRequestHeadersMap;
    }

    public void setRequestHeadersMap(Map<String, String> requestHeadersMap) {
        mRequestHeadersMap = requestHeadersMap;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {
        mStatus = status;
    }

    public int getSize() {
        return mSize;
    }

    public void setSize(int size) {
        mSize = size;
    }

    public long getCostTime() {
        return mCostTime;
    }

    public void setCostTime(long costTime) {
        mCostTime = costTime;
    }

    public String getContentType() {
        return mContentType;
    }

    public void setContentType(String contentType) {
        mContentType = contentType;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public Map<String, String> getResponseHeadersMap() {
        return mResponseHeadersMap;
    }

    public void setResponseHeadersMap(Map<String, String> responseHeadersMap) {
        mResponseHeadersMap = responseHeadersMap;
    }

    public long getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(long createTime) {
        mCreateTime = createTime;
    }

    public String getCURL() {
        return mCURL;
    }

    public void setCURL(String CURL) {
        mCURL = CURL;
    }

    public Map<String, Long> getNetworkEventMap() {
        return mNetworkEventMap;
    }

    public void setNetworkEventMap(Map<String, Long> networkEventMap) {
        mNetworkEventMap = networkEventMap;
    }

    @Override
    public String toString() {
        return "NetworkFeedModel{" +
                "mRequestId='" + mRequestId + '\'' +
                ", mUrl='" + mUrl + '\'' +
                ", mHost='" + mHost + '\'' +
                ", mMethod='" + mMethod + '\'' +
                ", mRequestHeadersMap=" + mRequestHeadersMap +
                ", mName='" + mName + '\'' +
                ", mStatus=" + mStatus +
                ", mSize=" + mSize +
                ", mCostTime=" + mCostTime +
                ", mContentType='" + mContentType + '\'' +
                ", mBody='" + mBody + '\'' +
                ", mResponseHeadersMap=" + mResponseHeadersMap +
                ", mCreateTime=" + mCreateTime +
                ", mCURL='" + mCURL + '\'' +
                ", mNetworkEventMap=" + mNetworkEventMap +
                '}';
    }
}
