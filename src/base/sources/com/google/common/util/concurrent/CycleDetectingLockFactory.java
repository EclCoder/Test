package com.google.common.util.concurrent;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CycleDetectingLockFactory {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class PotentialDeadlockException extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f21927c;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f21927c; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final StackTraceElement[] f21928a = new StackTraceElement[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final com.google.common.collect.g0 f21929b = com.google.common.collect.g0.C(CycleDetectingLockFactory.class.getName(), a.class.getName(), b.class.getName());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {
    }
}
