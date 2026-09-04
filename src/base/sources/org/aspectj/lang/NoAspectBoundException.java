package org.aspectj.lang;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class NoAspectBoundException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Throwable f49433a;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f49433a;
    }
}
