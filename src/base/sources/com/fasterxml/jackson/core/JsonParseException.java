package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class JsonParseException extends StreamReadException {
    private static final long serialVersionUID = 2;

    public JsonParseException(e eVar, String str) {
        super(eVar, str);
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    public JsonParseException(e eVar, String str, Throwable th2) {
        super(eVar, str, th2);
    }

    public JsonParseException h(i8.g gVar) {
        return this;
    }
}
