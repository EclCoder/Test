package rj;

import dj.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import oj.e;
import oj.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f51353e;

    public /* synthetic */ b(String str, int i10, int i11, e eVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? new e(nj.b.TYPE_0, nj.a.OVER_CONNECTION.g()) : eVar);
    }

    @Override // oj.i
    public f d() {
        return f.DATA_AMF0;
    }

    @Override // oj.i
    public void f(InputStream input) throws IOException {
        s.h(input, "input");
        this.f51353e.clear();
        l(0);
        k kVar = new k(null, 1, null);
        kVar.d(input);
        kVar.c(input);
        this.f51352d = kVar.g();
        l(k() + kVar.a() + 1);
        while (k() < b().b()) {
            dj.b bVarA = dj.b.f36943a.a(input);
            this.f51353e.add(bVarA);
            l(k() + bVarA.a() + 1);
        }
    }

    @Override // oj.i
    public byte[] g() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k kVar = new k(this.f51352d);
        kVar.f(byteArrayOutputStream);
        kVar.e(byteArrayOutputStream);
        for (dj.b bVar : this.f51353e) {
            bVar.f(byteArrayOutputStream);
            bVar.e(byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.g(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final void m(dj.b amfData) {
        s.h(amfData, "amfData");
        this.f51353e.add(amfData);
        l(k() + amfData.a() + 1);
        b().h(k());
    }

    public String toString() {
        return "Data(name='" + this.f51352d + "', data=" + this.f51353e + ", bodySize=" + k() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String name, int i10, int i11, e basicHeader) {
        super(i10, i11, basicHeader);
        s.h(name, "name");
        s.h(basicHeader, "basicHeader");
        this.f51352d = name;
        ArrayList arrayList = new ArrayList();
        this.f51353e = arrayList;
        l(k() + new k(this.f51352d).a() + 1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l(k() + ((dj.b) it.next()).a() + 1);
        }
    }
}
