package com.google.api.client.json.rpc2;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Key;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class JsonRpcRequest extends GenericData {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private Object f21569id;

    @Key
    private final String jsonrpc = MBridgeConstans.NATIVE_VIDEO_VERSION;

    @Key
    private String method;

    @Key
    private Object params;

    public Object getId() {
        return this.f21569id;
    }

    public String getMethod() {
        return this.method;
    }

    public Object getParameters() {
        return this.params;
    }

    public String getVersion() {
        return MBridgeConstans.NATIVE_VIDEO_VERSION;
    }

    public void setId(Object obj) {
        this.f21569id = obj;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setParameters(Object obj) {
        this.params = obj;
    }

    @Override // com.google.api.client.util.GenericData
    public JsonRpcRequest set(String str, Object obj) {
        return (JsonRpcRequest) super.set(str, obj);
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public JsonRpcRequest clone() {
        return (JsonRpcRequest) super.clone();
    }
}
