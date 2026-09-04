package xn;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f56959e;

    public m(l delegate) {
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.f56959e = delegate;
    }

    @Override // xn.l
    public o0 c(h0 file, boolean z10) {
        kotlin.jvm.internal.s.h(file, "file");
        return this.f56959e.c(m0(file, "appendingSink", "file"), z10);
    }

    @Override // xn.l
    public j c0(h0 file) {
        kotlin.jvm.internal.s.h(file, "file");
        return this.f56959e.c0(m0(file, "openReadOnly", "file"));
    }

    @Override // xn.l, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56959e.close();
    }

    @Override // xn.l
    public void d(h0 source, h0 target) {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(target, "target");
        this.f56959e.d(m0(source, "atomicMove", "source"), m0(target, "atomicMove", "target"));
    }

    @Override // xn.l
    public o0 g0(h0 file, boolean z10) {
        kotlin.jvm.internal.s.h(file, "file");
        return this.f56959e.g0(m0(file, "sink", "file"), z10);
    }

    @Override // xn.l
    public q0 i0(h0 file) {
        kotlin.jvm.internal.s.h(file, "file");
        return this.f56959e.i0(m0(file, "source", "file"));
    }

    @Override // xn.l
    public void j(h0 dir, boolean z10) {
        kotlin.jvm.internal.s.h(dir, "dir");
        this.f56959e.j(m0(dir, "createDirectory", "dir"), z10);
    }

    @Override // xn.l
    public void m(h0 path, boolean z10) {
        kotlin.jvm.internal.s.h(path, "path");
        this.f56959e.m(m0(path, "delete", MBridgeConstans.DYNAMIC_VIEW_WX_PATH), z10);
    }

    public h0 m0(h0 path, String functionName, String parameterName) {
        kotlin.jvm.internal.s.h(path, "path");
        kotlin.jvm.internal.s.h(functionName, "functionName");
        kotlin.jvm.internal.s.h(parameterName, "parameterName");
        return path;
    }

    public h0 p0(h0 path, String functionName) {
        kotlin.jvm.internal.s.h(path, "path");
        kotlin.jvm.internal.s.h(functionName, "functionName");
        return path;
    }

    @Override // xn.l
    public List r(h0 dir) {
        kotlin.jvm.internal.s.h(dir, "dir");
        List listR = this.f56959e.r(m0(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(p0((h0) it.next(), "list"));
        }
        gl.r.x(arrayList);
        return arrayList;
    }

    @Override // xn.l
    public k t(h0 path) {
        kotlin.jvm.internal.s.h(path, "path");
        k kVarT = this.f56959e.t(m0(path, "metadataOrNull", MBridgeConstans.DYNAMIC_VIEW_WX_PATH));
        if (kVarT == null) {
            return null;
        }
        return kVarT.d() == null ? kVarT : k.b(kVarT, false, false, p0(kVarT.d(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public String toString() {
        return kotlin.jvm.internal.l0.b(getClass()).k() + '(' + this.f56959e + ')';
    }
}
