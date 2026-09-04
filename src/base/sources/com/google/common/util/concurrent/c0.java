package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Logger f21967b;

    c0(Class cls) {
        this.f21966a = cls.getName();
    }

    Logger a() {
        Logger logger = this.f21967b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.f21967b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f21966a);
                this.f21967b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
