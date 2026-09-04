package com.inmobi.media;

import android.content.Context;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3216p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC3009h6 f27169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rf f27170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3178nk f27171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f27173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f27174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final em.o0 f27175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2983g6 f27176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public em.z1 f27177j;

    public C3216p6(String tableName, AbstractC3009h6 mEventDao, Rf mPayloadProvider, C2983g6 eventConfig, C3178nk c3178nk) {
        kotlin.jvm.internal.s.h(tableName, "tableName");
        kotlin.jvm.internal.s.h(mEventDao, "mEventDao");
        kotlin.jvm.internal.s.h(mPayloadProvider, "mPayloadProvider");
        kotlin.jvm.internal.s.h(eventConfig, "eventConfig");
        this.f27168a = tableName;
        this.f27169b = mEventDao;
        this.f27170c = mPayloadProvider;
        this.f27171d = c3178nk;
        this.f27172e = C3216p6.class.getSimpleName();
        this.f27173f = new AtomicBoolean(false);
        this.f27174g = new AtomicBoolean(false);
        this.f27175h = H9.f24930c;
        this.f27176i = eventConfig;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x0157  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Object a(C3216p6 listener, boolean z10, kotlin.coroutines.jvm.internal.d dVar) {
        C3060j6 c3060j6;
        C2983g6 c2983g6;
        boolean z11;
        Rk rk2;
        C2983g6 c2983g7;
        boolean z12;
        Rk rk3;
        int iIntValue;
        int iN;
        C2983g6 c2983g8;
        int i10;
        long j10;
        Object objA;
        int i11;
        boolean zBooleanValue;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        Rk rk4;
        long j11;
        C3035i6 payload;
        listener.getClass();
        if (dVar instanceof C3060j6) {
            c3060j6 = (C3060j6) dVar;
            int i13 = c3060j6.f26789j;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3060j6.f26789j = i13 - Integer.MIN_VALUE;
            } else {
                c3060j6 = new C3060j6(listener, dVar);
            }
        } else {
            c3060j6 = new C3060j6(listener, dVar);
        }
        C3060j6 c3060j7 = c3060j6;
        Object objA2 = c3060j7.f26787h;
        Object objF = ll.b.f();
        int i14 = c3060j7.f26789j;
        if (i14 == 0) {
            fl.s.b(objA2);
            c2983g6 = listener.f27176i;
            if (listener.f27174g.get() || listener.f27173f.get() || c2983g6 == null) {
                return fl.g0.f38750a;
            }
            String TAG = listener.f27172e;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            long jCurrentTimeMillis = System.currentTimeMillis() - (c2983g6.f26584b * ((long) 1000));
            AbstractC3009h6 abstractC3009h6 = listener.f27169b;
            c3060j7.f26780a = null;
            c3060j7.f26781b = c2983g6;
            z11 = z10;
            c3060j7.f26782c = z11;
            c3060j7.f26789j = 1;
            if (abstractC3009h6.a(jCurrentTimeMillis, c3060j7) != objF) {
                rk2 = null;
            }
            return objF;
        }
        if (i14 == 1) {
            boolean z16 = c3060j7.f26782c;
            c2983g6 = c3060j7.f26781b;
            rk2 = c3060j7.f26780a;
            fl.s.b(objA2);
            z11 = z16;
        } else {
            if (i14 == 2) {
                boolean z17 = c3060j7.f26782c;
                C2983g6 c2983g9 = c3060j7.f26781b;
                Rk rk5 = c3060j7.f26780a;
                fl.s.b(objA2);
                c2983g7 = c2983g9;
                rk3 = rk5;
                z12 = z17;
                iIntValue = ((Number) objA2).intValue();
                B5.f24500a.getClass();
                iN = B5.n();
                c2983g8 = listener.f27176i;
                if (c2983g8 == null) {
                    i10 = 0;
                } else {
                    i10 = (iN == 0 || iN != 1) ? c2983g8.f26589g : c2983g8.f26587e;
                }
                if (c2983g8 == null) {
                    j10 = 0;
                } else {
                    j10 = (iN == 0 || iN != 1) ? c2983g8.f26592j : c2983g8.f26591i;
                }
                long j12 = c2983g7.f26586d;
                c3060j7.f26780a = rk3;
                c3060j7.f26781b = c2983g7;
                c3060j7.f26782c = z12;
                c3060j7.f26784e = iIntValue;
                c3060j7.f26785f = i10;
                c3060j7.f26786g = j10;
                c3060j7.f26789j = 3;
                objA = listener.a(j12, c3060j7);
                if (objA != objF) {
                    i11 = iIntValue;
                    objA2 = objA;
                    zBooleanValue = ((Boolean) objA2).booleanValue();
                    long j13 = c2983g7.f26585c;
                    long j14 = c2983g7.f26586d;
                    c3060j7.f26780a = rk3;
                    c3060j7.f26781b = c2983g7;
                    c3060j7.f26782c = z12;
                    c3060j7.f26784e = i11;
                    c3060j7.f26785f = i10;
                    c3060j7.f26786g = j10;
                    c3060j7.f26783d = zBooleanValue;
                    c3060j7.f26789j = 4;
                    objA2 = listener.a(j13, j14, c3060j7);
                    if (objA2 != objF) {
                        z13 = z12;
                        z14 = zBooleanValue;
                        i12 = i10;
                        boolean zBooleanValue2 = ((Boolean) objA2).booleanValue();
                        if (i12 > i11) {
                        }
                        Rf rf2 = listener.f27170c;
                        c3060j7.f26780a = rk3;
                        c3060j7.f26781b = c2983g7;
                        c3060j7.f26782c = z13;
                        c3060j7.f26786g = j10;
                        c3060j7.f26789j = 5;
                        objA2 = rf2.a(c3060j7);
                        if (objA2 != objF) {
                            z15 = z13;
                            rk4 = rk3;
                            j11 = j10;
                        }
                    }
                }
                return objF;
            }
            if (i14 == 3) {
                long j15 = c3060j7.f26786g;
                int i15 = c3060j7.f26785f;
                int i16 = c3060j7.f26784e;
                z12 = c3060j7.f26782c;
                c2983g7 = c3060j7.f26781b;
                rk3 = c3060j7.f26780a;
                fl.s.b(objA2);
                j10 = j15;
                i10 = i15;
                i11 = i16;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                long j16 = c2983g7.f26585c;
                long j17 = c2983g7.f26586d;
                c3060j7.f26780a = rk3;
                c3060j7.f26781b = c2983g7;
                c3060j7.f26782c = z12;
                c3060j7.f26784e = i11;
                c3060j7.f26785f = i10;
                c3060j7.f26786g = j10;
                c3060j7.f26783d = zBooleanValue;
                c3060j7.f26789j = 4;
                objA2 = listener.a(j16, j17, c3060j7);
                if (objA2 != objF) {
                    z13 = z12;
                    z14 = zBooleanValue;
                    i12 = i10;
                    boolean zBooleanValue3 = ((Boolean) objA2).booleanValue();
                    if (i12 > i11) {
                    }
                    Rf rf3 = listener.f27170c;
                    c3060j7.f26780a = rk3;
                    c3060j7.f26781b = c2983g7;
                    c3060j7.f26782c = z13;
                    c3060j7.f26786g = j10;
                    c3060j7.f26789j = 5;
                    objA2 = rf3.a(c3060j7);
                    if (objA2 != objF) {
                        z15 = z13;
                        rk4 = rk3;
                        j11 = j10;
                    }
                }
                return objF;
            }
            if (i14 == 4) {
                z14 = c3060j7.f26783d;
                long j18 = c3060j7.f26786g;
                i12 = c3060j7.f26785f;
                i11 = c3060j7.f26784e;
                boolean z18 = c3060j7.f26782c;
                c2983g7 = c3060j7.f26781b;
                rk3 = c3060j7.f26780a;
                fl.s.b(objA2);
                j10 = j18;
                z13 = z18;
                boolean zBooleanValue4 = ((Boolean) objA2).booleanValue();
                if (i12 > i11 || z14 || zBooleanValue4) {
                    Rf rf4 = listener.f27170c;
                    c3060j7.f26780a = rk3;
                    c3060j7.f26781b = c2983g7;
                    c3060j7.f26782c = z13;
                    c3060j7.f26786g = j10;
                    c3060j7.f26789j = 5;
                    objA2 = rf4.a(c3060j7);
                    if (objA2 != objF) {
                        z15 = z13;
                        rk4 = rk3;
                        j11 = j10;
                    }
                    return objF;
                }
                return fl.g0.f38750a;
            }
            if (i14 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j19 = c3060j7.f26786g;
            boolean z19 = c3060j7.f26782c;
            C2983g6 c2983g10 = c3060j7.f26781b;
            Rk rk6 = c3060j7.f26780a;
            fl.s.b(objA2);
            z15 = z19;
            c2983g7 = c2983g10;
            rk4 = rk6;
            j11 = j19;
        }
        payload = (C3035i6) objA2;
        if (payload != null) {
            listener.f27173f.set(true);
            fl.k kVar = AbstractC3267r6.f27377a;
            String str = c2983g7.f26593k;
            int i17 = c2983g7.f26583a + 1;
            kotlin.jvm.internal.s.h(payload, "payload");
            kotlin.jvm.internal.s.h(listener, "listener");
            AbstractC3267r6.a(payload, str, i17, i17, j11, rk4, listener, z15);
        }
        return fl.g0.f38750a;
        AbstractC3009h6 abstractC3009h7 = listener.f27169b;
        c3060j7.f26780a = rk2;
        c3060j7.f26781b = c2983g6;
        c3060j7.f26782c = z11;
        c3060j7.f26789j = 2;
        objA2 = abstractC3009h7.a(c3060j7);
        if (objA2 != objF) {
            c2983g7 = c2983g6;
            z12 = z11;
            rk3 = rk2;
            iIntValue = ((Number) objA2).intValue();
            B5.f24500a.getClass();
            iN = B5.n();
            c2983g8 = listener.f27176i;
            if (c2983g8 == null) {
                i10 = 0;
            } else if (iN == 0) {
                i10 = c2983g8.f26589g;
            }
            if (c2983g8 == null) {
                j10 = 0;
            } else if (iN == 0) {
                j10 = c2983g8.f26592j;
            }
            long j110 = c2983g7.f26586d;
            c3060j7.f26780a = rk3;
            c3060j7.f26781b = c2983g7;
            c3060j7.f26782c = z12;
            c3060j7.f26784e = iIntValue;
            c3060j7.f26785f = i10;
            c3060j7.f26786g = j10;
            c3060j7.f26789j = 3;
            objA = listener.a(j110, c3060j7);
            if (objA != objF) {
                i11 = iIntValue;
                objA2 = objA;
                zBooleanValue = ((Boolean) objA2).booleanValue();
                long j111 = c2983g7.f26585c;
                long j112 = c2983g7.f26586d;
                c3060j7.f26780a = rk3;
                c3060j7.f26781b = c2983g7;
                c3060j7.f26782c = z12;
                c3060j7.f26784e = i11;
                c3060j7.f26785f = i10;
                c3060j7.f26786g = j10;
                c3060j7.f26783d = zBooleanValue;
                c3060j7.f26789j = 4;
                objA2 = listener.a(j111, j112, c3060j7);
                if (objA2 != objF) {
                    z13 = z12;
                    z14 = zBooleanValue;
                    i12 = i10;
                    boolean zBooleanValue5 = ((Boolean) objA2).booleanValue();
                    if (i12 > i11) {
                    }
                    Rf rf5 = listener.f27170c;
                    c3060j7.f26780a = rk3;
                    c3060j7.f26781b = c2983g7;
                    c3060j7.f26782c = z13;
                    c3060j7.f26786g = j10;
                    c3060j7.f26789j = 5;
                    objA2 = rf5.a(c3060j7);
                    if (objA2 != objF) {
                        z15 = z13;
                        rk4 = rk3;
                        j11 = j10;
                        payload = (C3035i6) objA2;
                        if (payload != null) {
                            listener.f27173f.set(true);
                            fl.k kVar2 = AbstractC3267r6.f27377a;
                            String str2 = c2983g7.f26593k;
                            int i18 = c2983g7.f26583a + 1;
                            kotlin.jvm.internal.s.h(payload, "payload");
                            kotlin.jvm.internal.s.h(listener, "listener");
                            AbstractC3267r6.a(payload, str2, i18, i18, j11, rk4, listener, z15);
                        }
                        return fl.g0.f38750a;
                    }
                }
            }
        }
        return objF;
    }

    public final long a() {
        Context context = Xi.f26021a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "batch_processing_info");
        String key = this.f27168a + KPtaxpyICj.HOpgL;
        kotlin.jvm.internal.s.h(key, "key");
        return laA.f25198a.getLong(key, -1L);
    }

    public final void a(long j10) {
        Context context = Xi.f26021a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            Ka.a(context, "batch_processing_info").a(this.f27168a + "_last_batch_process", j10, false);
        }
    }

    public final void a(boolean z10) {
        C2983g6 c2983g6 = this.f27176i;
        if (this.f27174g.get() || c2983g6 == null) {
            return;
        }
        long j10 = c2983g6.f26585c;
        em.z1 z1Var = this.f27177j;
        if (z1Var == null || !z1Var.isActive()) {
            String TAG = this.f27172e;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            em.o0 o0Var = this.f27175h;
            C2983g6 c2983g7 = this.f27176i;
            long jA = a();
            if (jA == -1) {
                a(System.currentTimeMillis());
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f27177j = J3.a(o0Var, Math.max(0L, (timeUnit.toSeconds(jA) + (c2983g7 != null ? c2983g7.f26585c : 0L)) - timeUnit.toSeconds(System.currentTimeMillis())) * 1000, j10 * 1000, new C3164n6(this, z10, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j10, kotlin.coroutines.jvm.internal.d dVar) {
        C3086k6 c3086k6;
        if (dVar instanceof C3086k6) {
            c3086k6 = (C3086k6) dVar;
            int i10 = c3086k6.f26843d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3086k6.f26843d = i10 - Integer.MIN_VALUE;
            } else {
                c3086k6 = new C3086k6(this, dVar);
            }
        } else {
            c3086k6 = new C3086k6(this, dVar);
        }
        Object objB = c3086k6.f26841b;
        Object objF = ll.b.f();
        int i11 = c3086k6.f26843d;
        if (i11 == 0) {
            fl.s.b(objB);
            AbstractC3009h6 abstractC3009h6 = this.f27169b;
            c3086k6.f26840a = j10;
            c3086k6.f26843d = 1;
            objB = abstractC3009h6.b(1, c3086k6);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = c3086k6.f26840a;
            fl.s.b(objB);
        }
        List list = (List) objB;
        return kotlin.coroutines.jvm.internal.b.a(!list.isEmpty() && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((AbstractC3056j2) list.get(0)).f26769c) > j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j10, long j11, kotlin.coroutines.jvm.internal.d dVar) {
        C3190o6 c3190o6;
        long seconds;
        if (dVar instanceof C3190o6) {
            c3190o6 = (C3190o6) dVar;
            int i10 = c3190o6.f27124e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3190o6.f27124e = i10 - Integer.MIN_VALUE;
            } else {
                c3190o6 = new C3190o6(this, dVar);
            }
        } else {
            c3190o6 = new C3190o6(this, dVar);
        }
        Object objB = c3190o6.f27122c;
        Object objF = ll.b.f();
        int i11 = c3190o6.f27124e;
        if (i11 == 0) {
            fl.s.b(objB);
            seconds = j10 + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            AbstractC3009h6 abstractC3009h6 = this.f27169b;
            c3190o6.f27120a = j11;
            c3190o6.f27121b = seconds;
            c3190o6.f27124e = 1;
            objB = abstractC3009h6.b(1, c3190o6);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            seconds = c3190o6.f27121b;
            j11 = c3190o6.f27120a;
            fl.s.b(objB);
        }
        List list = (List) objB;
        return kotlin.coroutines.jvm.internal.b.a(!list.isEmpty() && seconds - TimeUnit.MILLISECONDS.toSeconds(((AbstractC3056j2) list.get(0)).f26769c) >= j11);
    }
}
