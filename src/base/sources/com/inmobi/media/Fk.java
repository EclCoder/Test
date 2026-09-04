package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Fk;
import java.util.HashMap;
import java.util.Timer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3107l1 f24799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f24800b;

    public Fk(AbstractC3107l1 timeOutInformer) {
        kotlin.jvm.internal.s.h(timeOutInformer, "timeOutInformer");
        this.f24799a = timeOutInformer;
        this.f24800b = new HashMap();
    }

    public final boolean a(byte b10, long j10) {
        kotlin.jvm.internal.s.g("Fk", "TAG");
        if (this.f24800b.containsKey(Byte.valueOf(b10))) {
            a(b10);
        }
        try {
            Timer timer = new Timer("Fk");
            this.f24800b.put(Byte.valueOf(b10), timer);
            timer.schedule(new Ek(this, b10), j10);
            return true;
        } catch (InternalError e10) {
            kotlin.jvm.internal.s.g("Fk", "TAG");
            e10.toString();
            return false;
        }
    }

    public final void b(final byte b10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yh.o1
            @Override // java.lang.Runnable
            public final void run() {
                Fk.a(this.f57861a, b10);
            }
        });
    }

    public static final void a(Fk fk2, byte b10) {
        fk2.f24799a.a(b10);
    }

    public final void a(byte b10) {
        kotlin.jvm.internal.s.g("Fk", "TAG");
        Timer timer = (Timer) this.f24800b.get(Byte.valueOf(b10));
        if (timer != null) {
            timer.cancel();
            this.f24800b.remove(Byte.valueOf(b10));
        }
    }
}
