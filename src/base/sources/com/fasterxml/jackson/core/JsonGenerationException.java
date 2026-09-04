package com.fasterxml.jackson.core;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class JsonGenerationException extends JsonProcessingException {
    private static final long serialVersionUID = 123;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient c f16121b;

    public JsonGenerationException(String str, c cVar) {
        super(str, null);
        this.f16121b = cVar;
    }
}
