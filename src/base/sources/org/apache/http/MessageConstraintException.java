package org.apache.http;

import java.nio.charset.CharacterCodingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MessageConstraintException extends CharacterCodingException {
    private static final long serialVersionUID = 6077207720446368695L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49207a;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f49207a;
    }
}
