package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonParseException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class JsonEOFException extends JsonParseException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.g f16219c;

    public JsonEOFException(com.fasterxml.jackson.core.e eVar, com.fasterxml.jackson.core.g gVar, String str) {
        super(eVar, str);
        this.f16219c = gVar;
    }
}
