package oo;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class n extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co.l f49202a;

    public n(co.l lVar, InetAddress inetAddress, int i10) {
        super(inetAddress, i10);
        ip.a.h(lVar, "HTTP host");
        this.f49202a = lVar;
    }

    public co.l d() {
        return this.f49202a;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.f49202a.i() + ":" + getPort();
    }
}
