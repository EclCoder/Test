package org.apache.commons.math3.exception;

import ao.b;
import ao.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MathArithmeticException extends ArithmeticException {
    private static final long serialVersionUID = -6024911025449780478L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f49204a;

    public MathArithmeticException() {
        b bVar = new b(this);
        this.f49204a = bVar;
        bVar.a(d.ARITHMETIC_EXCEPTION, new Object[0]);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f49204a.g();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f49204a.h();
    }
}
