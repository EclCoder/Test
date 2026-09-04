package com.mbridge.msdk.tracker.network.toolbox;

import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.tracker.network.p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f33881d;

    public j(String str, String str2, p pVar) {
        this.f33879b = str;
        this.f33880c = str2;
        this.f33881d = pVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public List<InetAddress> a(String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.n.f33501a.a(str);
            return (listA.isEmpty() && i.b().c(this.f33879b, this.f33880c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e10) {
            if (i.b().c(this.f33879b, this.f33880c, str)) {
                return a(str, new UnknownHostException(e10.getMessage()));
            }
            throw e10;
        }
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) {
        p pVar = this.f33881d;
        if (pVar != null) {
            pVar.c(ImagesContract.LOCAL);
        }
        return i.b().a(str, unknownHostException);
    }
}
