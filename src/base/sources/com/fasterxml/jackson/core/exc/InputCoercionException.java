package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class InputCoercionException extends StreamReadException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final g f16189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Class f16190d;

    public InputCoercionException(e eVar, String str, g gVar, Class cls) {
        super(eVar, str);
        this.f16189c = gVar;
        this.f16190d = cls;
    }
}
