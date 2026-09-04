package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.lifecycle.b;
import com.google.common.util.concurrent.f0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import kotlin.jvm.internal.s;
import sc.m;
import sc.p;
import sc.x;
import sc.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlk {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb = new Object();
    private static final AtomicReference zzc = new AtomicReference();
    private static volatile zzlk zzd = null;
    private static volatile zzlk zze = null;
    private static final x zzf = y.a(zzlp.zza);
    private final zzoh zzg = new zzol();
    private final Context zzh;
    private final x zzi;
    private final x zzj;
    private final x zzk;
    private final x zzl;
    private final zzrf zzm;
    private final x zzn;
    private final zzqe zzo;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface zza {
        m zza();
    }

    /* synthetic */ zzlk(Context context, x xVar, x xVar2, final x xVar3, x xVar4, x xVar5, byte[] bArr) {
        Context applicationContext = context.getApplicationContext();
        p.o(applicationContext);
        p.o(xVar);
        p.o(xVar2);
        p.o(xVar3);
        p.o(xVar4);
        p.o(xVar5);
        x xVarA = y.a(xVar);
        x xVarA2 = y.a(xVar2);
        x xVarA3 = y.a(new x() { // from class: com.google.android.gms.internal.measurement.zzlq
            @Override // sc.x
            public final /* synthetic */ Object get() {
                int i10 = zzlk.zza;
                return (zzqm) ((m) xVar3.get()).k();
            }
        });
        x xVarA4 = y.a(xVar4);
        x xVarA5 = y.a(xVar5);
        this.zzh = applicationContext;
        this.zzi = xVarA;
        this.zzj = xVarA2;
        this.zzk = xVarA3;
        this.zzl = xVarA4;
        this.zzm = new zzrf(applicationContext, xVarA, xVarA4, xVarA2);
        this.zzn = xVarA5;
        this.zzo = new zzqe(applicationContext, xVarA, xVarA3, xVarA2);
    }

    public static void zza(Context context) {
        Context applicationContext;
        if (zzc.get() != null) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
        } catch (NullPointerException unused) {
            zzl();
            zzlz.zza(Level.WARNING, (Executor) zzf.get(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            applicationContext = null;
        }
        if (applicationContext != null) {
            b.a(zzc, null, applicationContext);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzlk zzb() {
        boolean z10;
        zzlk zzlkVar;
        zzls.zza();
        zzls.zzc();
        Context context = (Context) zzc.get();
        if (context == null) {
            zzls.zzb();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        zzlk zzlkVar2 = zzd;
        if (zzlkVar2 != null) {
            return zzlkVar2;
        }
        final Context context2 = context.getApplicationContext();
        try {
            s.h(context2, "context");
            s.h(zza.class, "singletonEntryPoint");
            Object applicationContext = context2.getApplicationContext();
            s.g(applicationContext, "getApplicationContext(...)");
            if (!(applicationContext instanceof zzagp)) {
                Class<?> cls = applicationContext.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            }
            try {
                Object objCast = zza.class.cast(((zzagp) applicationContext).zza());
                s.e(objCast);
                m mVarZza = ((zza) objCast).zza();
                z10 = true;
                try {
                    if (mVarZza.h()) {
                        return (zzlk) mVarZza.g();
                    }
                } catch (IllegalStateException unused) {
                }
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e10);
            }
        } catch (IllegalStateException unused2) {
            z10 = false;
        }
        synchronized (zzb) {
            try {
                if (zzd != null) {
                    zzlkVar = zzd;
                } else {
                    m mVarD = m.d();
                    boolean z11 = context2 instanceof zza;
                    if (z11) {
                        mVarD = ((zza) context2).zza();
                    }
                    zzlkVar = (zzlk) mVarD.j(new x() { // from class: com.google.android.gms.internal.measurement.zzll
                        @Override // sc.x
                        public final /* synthetic */ Object get() {
                            int i10 = zzlk.zza;
                            zzlj zzljVar = new zzlj(null);
                            zzljVar.zza(context2);
                            return zzljVar.zzb();
                        }
                    });
                    zzd = zzlkVar;
                    if (!z10 && !z11) {
                        zzlz.zza(Level.CONFIG, zzlkVar.zzg(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzlkVar;
    }

    public static boolean zzl() {
        zzls.zzb();
        if (zzc.get() == null) {
            zzls.zzd();
        }
        return false;
    }

    public final Context zzc() {
        return this.zzh;
    }

    public final zzrf zzd() {
        return this.zzm;
    }

    public final m zze() {
        return (m) this.zzn.get();
    }

    public final zzqe zzf() {
        return this.zzo;
    }

    public final f0 zzg() {
        return (f0) this.zzi.get();
    }

    public final zzmj zzh() {
        return (zzmj) this.zzj.get();
    }

    public final zzru zzi() {
        return (zzru) this.zzl.get();
    }

    public final zzqm zzj() {
        return (zzqm) this.zzk.get();
    }

    public final zzoh zzk() {
        return this.zzg;
    }
}
