package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements com.mbridge.msdk.tracker.network.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f33855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final c f33856b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    private static p b(t<?> tVar) {
        if (tVar == null) {
            return null;
        }
        try {
            if (!tVar.a() || TextUtils.isEmpty(tVar.t())) {
                return null;
            }
            p pVar = new p(tVar.p(), tVar.g() == 0 ? HttpMethods.GET : HttpMethods.POST);
            pVar.d("queue");
            pVar.e(tVar.d("local_id"));
            pVar.a(tVar.d("ad_type"));
            pVar.i(tVar.r());
            tVar.a(pVar);
            return pVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    @Override // com.mbridge.msdk.tracker.network.m
    public q a(t<?> tVar) throws b0 {
        g gVarA;
        byte[] bArr;
        IOException iOException;
        int i10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p pVarB = b(tVar);
        while (true) {
            try {
                gVarA = this.f33855a.a(tVar, f.a(tVar.d()));
                try {
                    int iD = gVarA.d();
                    a(pVarB, iD);
                    List<com.mbridge.msdk.tracker.network.g> listC = gVarA.c();
                    if (iD == 304) {
                        return k.a(tVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = gVarA.a();
                    byte[] bArrA = inputStreamA != null ? k.a(inputStreamA, gVarA.b(), this.f33856b, pVarB) : new byte[0];
                    try {
                        k.a(SystemClock.elapsedRealtime() - jElapsedRealtime, tVar, bArrA, iD);
                        if (iD < 200 || iD > 299) {
                            throw new IOException();
                        }
                        a(pVarB, 1, null);
                        return new q(iD, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    } catch (IOException e10) {
                        iOException = e10;
                        bArr = bArrA;
                        if (TextUtils.equals(iOException.getMessage(), "timeout")) {
                            i10 = 3;
                        } else {
                            i10 = 2;
                        }
                        a(pVarB, i10, iOException);
                        k.a(tVar, k.a(tVar, iOException, jElapsedRealtime, gVarA, bArr));
                    }
                } catch (IOException e11) {
                    e = e11;
                    bArr = null;
                    iOException = e;
                    if (TextUtils.equals(iOException.getMessage(), "timeout")) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                    a(pVarB, i10, iOException);
                    k.a(tVar, k.a(tVar, iOException, jElapsedRealtime, gVarA, bArr));
                }
            } catch (IOException e12) {
                e = e12;
                gVarA = null;
                bArr = null;
            }
            a(pVarB, i10, iOException);
            k.a(tVar, k.a(tVar, iOException, jElapsedRealtime, gVarA, bArr));
        }
    }

    public b(a aVar, c cVar) {
        this.f33855a = aVar;
        this.f33856b = cVar;
    }

    private static void a(p pVar, int i10, Exception exc) {
        if (pVar != null) {
            try {
                pVar.a(exc);
                pVar.a(i10);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(p pVar, int i10) {
        if (pVar != null) {
            try {
                pVar.b(i10);
            } catch (Exception unused) {
            }
        }
    }
}
