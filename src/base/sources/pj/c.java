package pj;

import ej.d;
import ej.h;
import ej.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import oj.e;
import oj.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f50156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f50157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f50158j;

    public /* synthetic */ c(String str, int i10, int i11, int i12, e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? new e(nj.b.TYPE_0, nj.a.OVER_CONNECTION.g()) : eVar);
    }

    @Override // oj.i
    public f d() {
        return f.COMMAND_AMF3;
    }

    @Override // oj.i
    public void f(InputStream input) throws IOException {
        s.h(input, "input");
        this.f50158j.clear();
        int iA = 0;
        while (iA < b().b()) {
            ej.b bVarA = ej.b.f37924a.a(input);
            iA += bVarA.a() + 1;
            this.f50158j.add(bVarA);
        }
        if (!this.f50158j.isEmpty()) {
            if (this.f50158j.get(0) instanceof i) {
                Object obj = this.f50158j.get(0);
                s.f(obj, "null cannot be cast to non-null type com.pedro.rtmp.amf.v3.Amf3String");
                s(((i) obj).g());
            }
            if (this.f50158j.size() >= 2 && (this.f50158j.get(1) instanceof d)) {
                Object obj2 = this.f50158j.get(1);
                s.f(obj2, "null cannot be cast to non-null type com.pedro.rtmp.amf.v3.Amf3Double");
                r((int) ((d) obj2).g());
            }
        }
        q(iA);
        b().h(k());
    }

    @Override // oj.i
    public byte[] g() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (ej.b bVar : this.f50158j) {
            bVar.f(byteArrayOutputStream);
            bVar.e(byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.g(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Override // pj.a
    public String l() {
        Object obj = this.f50158j.get(3);
        s.f(obj, "null cannot be cast to non-null type com.pedro.rtmp.amf.v3.Amf3Object");
        ej.b bVarG = ((h) obj).g("code");
        s.f(bVarG, "null cannot be cast to non-null type com.pedro.rtmp.amf.v3.Amf3String");
        return ((i) bVarG).g();
    }

    @Override // pj.a
    public String n() {
        Object obj = this.f50158j.get(3);
        s.f(obj, "null cannot be cast to non-null type com.pedro.rtmp.amf.v3.Amf3Object");
        ej.b bVarG = ((h) obj).g("description");
        s.f(bVarG, "null cannot be cast to non-null type com.pedro.rtmp.amf.v3.Amf3String");
        return ((i) bVarG).g();
    }

    @Override // pj.a
    public int p() {
        Object obj = this.f50158j.get(3);
        s.f(obj, "null cannot be cast to non-null type com.pedro.rtmp.amf.v3.Amf3Double");
        return (int) ((d) obj).g();
    }

    public String toString() {
        return "Command(name='" + o() + "', transactionId=" + m() + ", timeStamp=" + this.f50156h + ", streamId=" + this.f50157i + ", data=" + this.f50158j + ", bodySize=" + k() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String name, int i10, int i11, int i12, e basicHeader) {
        super(name, i10, i11, i12, basicHeader);
        s.h(name, "name");
        s.h(basicHeader, "basicHeader");
        this.f50156h = i11;
        this.f50157i = i12;
        ArrayList arrayList = new ArrayList();
        this.f50158j = arrayList;
        i iVar = new i(name);
        arrayList.add(iVar);
        q(k() + iVar.a() + 1);
        d dVar = new d(i10);
        q(k() + dVar.a() + 1);
        arrayList.add(dVar);
    }
}
