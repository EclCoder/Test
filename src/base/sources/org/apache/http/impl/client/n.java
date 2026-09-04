package org.apache.http.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class n implements fo.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f49293d = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f49296c;

    protected n(int i10, boolean z10, Collection collection) {
        this.f49294a = i10;
        this.f49295b = z10;
        this.f49296c = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f49296c.add((Class) it.next());
        }
    }

    @Override // fo.i
    public boolean a(IOException iOException, int i10, gp.f fVar) {
        ip.a.h(iOException, "Exception parameter");
        ip.a.h(fVar, "HTTP context");
        if (i10 > this.f49294a || this.f49296c.contains(iOException.getClass())) {
            return false;
        }
        Iterator it = this.f49296c.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(iOException)) {
                return false;
            }
        }
        ko.a aVarH = ko.a.h(fVar);
        co.o oVarE = aVarH.e();
        if (c(oVarE)) {
            return false;
        }
        return b(oVarE) || !aVarH.g() || this.f49295b;
    }

    protected boolean b(co.o oVar) {
        return !(oVar instanceof co.k);
    }

    protected boolean c(co.o oVar) {
        if (oVar instanceof c0) {
            oVar = ((c0) oVar).c();
        }
        return (oVar instanceof io.q) && ((io.q) oVar).isAborted();
    }

    public n(int i10, boolean z10) {
        this(i10, z10, Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class));
    }

    public n() {
        this(3, false);
    }
}
