package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.FacebookException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15130f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f15131g = b.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile b f15132h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f15134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15137e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final b a(b bVar) {
            bVar.f15134b = System.currentTimeMillis();
            b.f15132h = bVar;
            return bVar;
        }

        private final b b(Context context) {
            b bVarC = c(context);
            if (bVarC != null) {
                return bVarC;
            }
            b bVarD = d(context);
            return bVarD == null ? new b() : bVarD;
        }

        private final b c(Context context) {
            Method methodM;
            Object objV;
            try {
                if (!g(context) || (methodM = e1.M("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objV = e1.V(null, methodM, context)) == null) {
                    return null;
                }
                Method methodL = e1.L(objV.getClass(), "getId", new Class[0]);
                Method methodL2 = e1.L(objV.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodL != null && methodL2 != null) {
                    b bVar = new b();
                    bVar.f15133a = (String) e1.V(objV, methodL, new Object[0]);
                    Boolean bool = (Boolean) e1.V(objV, methodL2, new Object[0]);
                    bVar.f15137e = bool != null ? bool.booleanValue() : false;
                    return bVar;
                }
                return null;
            } catch (Exception e10) {
                e1.k0("android_id", e10);
                return null;
            }
        }

        private final b d(Context context) {
            if (!g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        C0266b c0266b = new C0266b(cVar.a());
                        b bVar = new b();
                        bVar.f15133a = c0266b.B();
                        bVar.f15137e = c0266b.C();
                        return bVar;
                    }
                } catch (Exception e10) {
                    e1.k0("android_id", e10);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        private final boolean g(Context context) {
            Method methodM = e1.M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodM == null) {
                return false;
            }
            Object objV = e1.V(null, methodM, context);
            return (objV instanceof Integer) && kotlin.jvm.internal.s.c(objV, 0);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x006e A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0083, B:27:0x0089, B:29:0x008e, B:31:0x0093, B:21:0x006e, B:23:0x007b, B:53:0x00f1, B:54:0x00f8), top: B:66:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x007b A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #5 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0064, B:25:0x0083, B:27:0x0089, B:29:0x008e, B:31:0x0093, B:21:0x006e, B:23:0x007b, B:53:0x00f1, B:54:0x00f8), top: B:66:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x011c  */
        /* JADX WARN: Code duplicated, block: B:68:? A[SYNTHETIC] */
        public final b e(Context context) throws Throwable {
            Exception exc;
            Cursor cursor;
            Throwable th2;
            Uri uri;
            String str;
            Uri uri2;
            kotlin.jvm.internal.s.h(context, "context");
            b bVarB = b(context);
            Cursor cursor2 = null;
            try {
                if (kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
                b bVar = b.f15132h;
                if (bVar != null && System.currentTimeMillis() - bVar.f15134b < 3600000) {
                    return bVar;
                }
                String[] strArr = {"aid", "androidid", "limit_tracking"};
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if (providerInfoResolveContentProvider != null) {
                    String str2 = providerInfoResolveContentProvider.packageName;
                    kotlin.jvm.internal.s.g(str2, "contentProviderInfo.packageName");
                    if (p.a(context, str2)) {
                        uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                    } else {
                        if (providerInfoResolveContentProvider2 != null) {
                            str = providerInfoResolveContentProvider2.packageName;
                            kotlin.jvm.internal.s.g(str, "wakizashiProviderInfo.packageName");
                            if (p.a(context, str)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            }
                        }
                        uri = null;
                    }
                    uri = uri2;
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        str = providerInfoResolveContentProvider2.packageName;
                        kotlin.jvm.internal.s.g(str, "wakizashiProviderInfo.packageName");
                        if (p.a(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = uri2;
                        }
                    }
                    uri = null;
                }
                String strF = f(context);
                if (strF != null) {
                    bVarB.f15136d = strF;
                }
                if (uri == null) {
                    return a(bVarB);
                }
                Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("aid");
                            int columnIndex2 = cursorQuery.getColumnIndex("androidid");
                            int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                            bVarB.f15135c = cursorQuery.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && bVarB.h() == null) {
                                bVarB.f15133a = cursorQuery.getString(columnIndex2);
                                bVarB.f15137e = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                            }
                            cursorQuery.close();
                            return a(bVarB);
                        }
                    } catch (Exception e10) {
                        cursor = cursorQuery;
                        exc = e10;
                        try {
                            e1.l0(b.f15131g, "Caught unexpected exception in getAttributionId(): " + exc);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            th2 = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                throw th2;
                            }
                            cursor2.close();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursorQuery;
                        th2 = th;
                        if (cursor2 != null) {
                            throw th2;
                        }
                        cursor2.close();
                        throw th2;
                    }
                }
                b bVarA = a(bVarB);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return bVarA;
            } catch (Exception e11) {
                exc = e11;
                cursor = null;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        public final boolean h(Context context) throws Throwable {
            kotlin.jvm.internal.s.h(context, "context");
            b bVarE = e(context);
            return bVarE != null && bVarE.k();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0266b implements IInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15138b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBinder f15139a;

        /* JADX INFO: renamed from: com.facebook.internal.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public C0266b(IBinder binder) {
            kotlin.jvm.internal.s.h(binder, "binder");
            this.f15139a = binder;
        }

        public final String B() {
            Parcel parcelObtain = Parcel.obtain();
            kotlin.jvm.internal.s.g(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            kotlin.jvm.internal.s.g(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f15139a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean C() {
            Parcel parcelObtain = Parcel.obtain();
            kotlin.jvm.internal.s.g(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            kotlin.jvm.internal.s.g(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f15139a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f15139a;
        }
    }

    public final String h() {
        if (com.facebook.h0.K() && com.facebook.h0.l()) {
            return this.f15133a;
        }
        return null;
    }

    public final String i() {
        return this.f15136d;
    }

    public final String j() {
        return this.f15135c;
    }

    public final boolean k() {
        return this.f15137e;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f15140a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BlockingQueue f15141b = new LinkedBlockingDeque();

        public final IBinder a() throws InterruptedException {
            if (!this.f15140a.compareAndSet(false, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object objTake = this.f15141b.take();
            kotlin.jvm.internal.s.g(objTake, "queue.take()");
            return (IBinder) objTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f15141b.put(iBinder);
                } catch (InterruptedException e10) {
                    e1.m0(b.f15131g, "Service connection interrupted", e10);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
