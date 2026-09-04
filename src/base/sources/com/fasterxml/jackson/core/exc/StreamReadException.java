package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class StreamReadException extends JsonProcessingException {
    static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient e f16191b;

    public StreamReadException(e eVar, String str) {
        super(str, eVar == null ? null : eVar.k());
        this.f16191b = eVar;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    public StreamReadException(e eVar, String str, Throwable th2) {
        super(str, eVar == null ? null : eVar.k(), th2);
        this.f16191b = eVar;
    }
}
