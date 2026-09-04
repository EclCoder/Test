package com.fasterxml.jackson.core;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class JsonProcessingException extends IOException {
    static final long serialVersionUID = 123;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected d f16122a;

    protected JsonProcessingException(String str, d dVar, Throwable th2) {
        super(str);
        if (th2 != null) {
            initCause(th2);
        }
        this.f16122a = dVar;
    }

    public d d() {
        return this.f16122a;
    }

    protected String g() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        d dVarD = d();
        String strG = g();
        if (dVarD == null && strG == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (strG != null) {
            sb2.append(strG);
        }
        if (dVarD != null) {
            sb2.append('\n');
            sb2.append(" at ");
            sb2.append(dVarD.toString());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected JsonProcessingException(String str, d dVar) {
        this(str, dVar, null);
    }
}
