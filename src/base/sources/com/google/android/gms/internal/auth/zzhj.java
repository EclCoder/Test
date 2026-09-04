package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhj {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z10;
        boolean z11;
        zzhi zzhiVar;
        Unsafe unsafeZzg = zzg();
        zzb = unsafeZzg;
        int i10 = zzds.zza;
        zzc = Memory.class;
        Class cls = Long.TYPE;
        boolean zZzs = zzs(cls);
        zzd = zZzs;
        Class cls2 = Integer.TYPE;
        boolean zZzs2 = zzs(cls2);
        zzhi zzhgVar = null;
        if (unsafeZzg != null) {
            if (zZzs) {
                zzhgVar = new zzhh(unsafeZzg);
            } else if (zZzs2) {
                zzhgVar = new zzhg(unsafeZzg);
            }
        }
        zze = zzhgVar;
        if (zzhgVar == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = zzhgVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzy() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                zzh(th2);
            }
        }
        zzf = z10;
        zzhi zzhiVar2 = zze;
        if (zzhiVar2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = zzhiVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th3) {
                zzh(th3);
                z11 = false;
            }
        }
        zzg = z11;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        Field fieldZzy = zzy();
        if (fieldZzy != null && (zzhiVar = zze) != null) {
            zzhiVar.zza.objectFieldOffset(fieldZzy);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhj() {
    }

    static double zza(Object obj, long j10) {
        return zze.zza(obj, j10);
    }

    static float zzb(Object obj, long j10) {
        return zze.zzb(obj, j10);
    }

    static int zzc(Object obj, long j10) {
        return zze.zza.getInt(obj, j10);
    }

    static long zzd(Object obj, long j10) {
        return zze.zza.getLong(obj, j10);
    }

    static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object zzf(Object obj, long j10) {
        return zze.zza.getObject(obj, j10);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th2) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    static /* synthetic */ void zzi(Object obj, long j10, boolean z10) {
        zzhi zzhiVar = zze;
        long j11 = (-4) & j10;
        int i10 = zzhiVar.zza.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j11, ((z10 ? 1 : 0) << i11) | ((~(255 << i11)) & i10));
    }

    static /* synthetic */ void zzj(Object obj, long j10, boolean z10) {
        zzhi zzhiVar = zze;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        zzhiVar.zza.putInt(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & zzhiVar.zza.getInt(obj, j11)));
    }

    static void zzk(Object obj, long j10, boolean z10) {
        zze.zzc(obj, j10, z10);
    }

    static void zzl(Object obj, long j10, double d10) {
        zze.zzd(obj, j10, d10);
    }

    static void zzm(Object obj, long j10, float f10) {
        zze.zze(obj, j10, f10);
    }

    static void zzn(Object obj, long j10, int i10) {
        zze.zza.putInt(obj, j10, i10);
    }

    static void zzo(Object obj, long j10, long j11) {
        zze.zza.putLong(obj, j10, j11);
    }

    static void zzp(Object obj, long j10, Object obj2) {
        zze.zza.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j10) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j10) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzs(Class cls) {
        int i10 = zzds.zza;
        try {
            Class cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzt(Object obj, long j10) {
        return zze.zzf(obj, j10);
    }

    static boolean zzu() {
        return zzg;
    }

    static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i10 = zzds.zza;
        Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (fieldZzz != null) {
            return fieldZzz;
        }
        Field fieldZzz2 = zzz(Buffer.class, "address");
        if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
