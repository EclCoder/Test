package com.inmobi.media;

import android.media.MediaPlayer;
import com.inmobi.media.C3414wn;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.wn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3414wn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaPlayer f27812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em.o0 f27813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm.v f27815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f27816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public em.z1 f27817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27818g;

    public C3414wn(MediaPlayer mediaPlayer, em.o0 coroutineScope, long j10, hm.v progressEvents) {
        kotlin.jvm.internal.s.h(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(progressEvents, "progressEvents");
        this.f27812a = mediaPlayer;
        this.f27813b = coroutineScope;
        this.f27814c = j10;
        this.f27815d = progressEvents;
        this.f27816e = new AtomicBoolean(false);
        this.f27818g = -1;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final Object a(C3414wn c3414wn, kotlin.coroutines.jvm.internal.d dVar) {
        C3362un c3362un;
        boolean zIsPlaying;
        int currentPosition;
        Object objEmit;
        int i10;
        Object objEmit2;
        int i11;
        Object objEmit3;
        c3414wn.getClass();
        if (dVar instanceof C3362un) {
            c3362un = (C3362un) dVar;
            int i12 = c3362un.f27651e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c3362un.f27651e = i12 - Integer.MIN_VALUE;
            } else {
                c3362un = new C3362un(c3414wn, dVar);
            }
        } else {
            c3362un = new C3362un(c3414wn, dVar);
        }
        Object obj = c3362un.f27649c;
        Object objF = ll.b.f();
        int i13 = c3362un.f27651e;
        if (i13 == 0) {
            fl.s.b(obj);
            MediaPlayer mediaPlayer = c3414wn.f27812a;
            kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
            try {
                zIsPlaying = mediaPlayer.isPlaying();
            } catch (IllegalStateException unused) {
                zIsPlaying = false;
            }
            if (zIsPlaying) {
                currentPosition = c3414wn.f27812a.getCurrentPosition();
                int duration = c3414wn.f27812a.getDuration();
                if (duration == -1) {
                    return fl.g0.f38750a;
                }
                int i14 = duration > 0 ? (currentPosition * 100) / duration : 0;
                if (c3414wn.f27818g == 4 && i14 < 25) {
                    c3414wn.f27818g = -1;
                }
                c3362un.f27647a = currentPosition;
                c3362un.f27648b = i14;
                c3362un.f27651e = 1;
                if (c3414wn.f27818g >= 0) {
                    objEmit = fl.g0.f38750a;
                } else {
                    c3414wn.f27818g = 0;
                    objEmit = c3414wn.f27815d.emit(new Bn("VideoProgressTracker", duration), c3362un);
                    if (objEmit != ll.b.f()) {
                        objEmit = fl.g0.f38750a;
                    }
                }
                if (objEmit == objF) {
                    return objF;
                }
                i10 = i14;
                c3362un.f27647a = currentPosition;
                c3362un.f27648b = i10;
                c3362un.f27651e = 2;
                if (c3414wn.a(i10, 25, 1)) {
                    c3414wn.f27818g = 1;
                    objEmit2 = c3414wn.f27815d.emit(Om.f25436a, c3362un);
                    if (objEmit2 != ll.b.f()) {
                        objEmit2 = fl.g0.f38750a;
                    }
                } else if (c3414wn.a(i10, 50, 2)) {
                    c3414wn.f27818g = 2;
                    objEmit2 = c3414wn.f27815d.emit(C3490zn.f28037a, c3362un);
                    if (objEmit2 != ll.b.f()) {
                        objEmit2 = fl.g0.f38750a;
                    }
                } else if (c3414wn.a(i10, 75, 3)) {
                    c3414wn.f27818g = 3;
                    objEmit2 = c3414wn.f27815d.emit(In.f25036a, c3362un);
                    if (objEmit2 != ll.b.f()) {
                        objEmit2 = fl.g0.f38750a;
                    }
                } else {
                    objEmit2 = fl.g0.f38750a;
                }
                if (objEmit2 == objF) {
                    return objF;
                }
                i11 = currentPosition;
                c3362un.f27651e = 3;
                if (c3414wn.f27818g != 4) {
                    objEmit3 = fl.g0.f38750a;
                } else {
                    objEmit3 = fl.g0.f38750a;
                }
                if (objEmit3 == objF) {
                    return objF;
                }
            }
        } else if (i13 == 1) {
            i10 = c3362un.f27648b;
            int i15 = c3362un.f27647a;
            fl.s.b(obj);
            currentPosition = i15;
            c3362un.f27647a = currentPosition;
            c3362un.f27648b = i10;
            c3362un.f27651e = 2;
            if (c3414wn.a(i10, 25, 1)) {
                c3414wn.f27818g = 1;
                objEmit2 = c3414wn.f27815d.emit(Om.f25436a, c3362un);
                if (objEmit2 != ll.b.f()) {
                    objEmit2 = fl.g0.f38750a;
                }
            } else if (c3414wn.a(i10, 50, 2)) {
                c3414wn.f27818g = 2;
                objEmit2 = c3414wn.f27815d.emit(C3490zn.f28037a, c3362un);
                if (objEmit2 != ll.b.f()) {
                    objEmit2 = fl.g0.f38750a;
                }
            } else if (c3414wn.a(i10, 75, 3)) {
                c3414wn.f27818g = 3;
                objEmit2 = c3414wn.f27815d.emit(In.f25036a, c3362un);
                if (objEmit2 != ll.b.f()) {
                    objEmit2 = fl.g0.f38750a;
                }
            } else {
                objEmit2 = fl.g0.f38750a;
            }
            if (objEmit2 == objF) {
                return objF;
            }
            i11 = currentPosition;
            c3362un.f27651e = 3;
            if (c3414wn.f27818g != 4) {
                objEmit3 = fl.g0.f38750a;
            } else {
                objEmit3 = fl.g0.f38750a;
            }
            if (objEmit3 == objF) {
                return objF;
            }
        } else if (i13 == 2) {
            i10 = c3362un.f27648b;
            i11 = c3362un.f27647a;
            fl.s.b(obj);
            c3362un.f27651e = 3;
            if (c3414wn.f27818g != 4 || (objEmit3 = c3414wn.f27815d.emit(new C3207on(i11, i10), c3362un)) != ll.b.f()) {
                objEmit3 = fl.g0.f38750a;
            }
            if (objEmit3 == objF) {
                return objF;
            }
        } else {
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }

    public final void b() {
        if (this.f27816e.getAndSet(true)) {
            return;
        }
        this.f27817f = em.k.d(this.f27813b, null, null, new C3388vn(this, null), 3, null);
        a();
    }

    public final void c() {
        if (this.f27816e.getAndSet(false)) {
            this.f27812a.setOnCompletionListener(null);
            L6.a(this.f27817f);
            this.f27817f = null;
        }
    }

    public final void a() {
        this.f27812a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: yh.oc
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C3414wn.a(this.f57871a, mediaPlayer);
            }
        });
    }

    public static final void a(C3414wn c3414wn, MediaPlayer mediaPlayer) {
        c3414wn.f27818g = 4;
        em.k.d(c3414wn.f27813b, null, null, new C3336tn(c3414wn, null), 3, null);
    }

    public final boolean a(int i10, int i11, int i12) {
        return i12 >= -1 && i12 <= 4 && i10 >= i11 && this.f27818g == i12 - 1;
    }
}
