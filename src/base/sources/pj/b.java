package pj;

import dj.g;
import dj.h;
import dj.k;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import oj.e;
import oj.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f50153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f50154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f50155j;

    public /* synthetic */ b(String str, int i10, int i11, int i12, e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? new e(nj.b.TYPE_0, nj.a.OVER_CONNECTION.g()) : eVar);
    }

    @Override // oj.i
    public f d() {
        return f.COMMAND_AMF0;
    }

    @Override // oj.i
    public void f(InputStream input) {
        s.h(input, "input");
        this.f50155j.clear();
        int iA = 0;
        while (iA < b().b()) {
            dj.b bVarA = dj.b.f36943a.a(input);
            iA += bVarA.a() + 1;
            this.f50155j.add(bVarA);
        }
        if (!this.f50155j.isEmpty()) {
            if (this.f50155j.get(0) instanceof k) {
                Object obj = this.f50155j.get(0);
                s.f(obj, "null cannot be cast to non-null type com.pedro.rtmp.amf.v0.AmfString");
                s(((k) obj).g());
            }
            if (this.f50155j.size() >= 2 && (this.f50155j.get(1) instanceof g)) {
                Object obj2 = this.f50155j.get(1);
                s.f(obj2, "null cannot be cast to non-null type com.pedro.rtmp.amf.v0.AmfNumber");
                r((int) ((g) obj2).g());
            }
        }
        q(iA);
        b().h(k());
    }

    @Override // oj.i
    public byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (dj.b bVar : this.f50155j) {
            bVar.f(byteArrayOutputStream);
            bVar.e(byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.g(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Override // pj.a
    public String l() {
        Object obj = this.f50155j.get(3);
        s.f(obj, "null cannot be cast to non-null type com.pedro.rtmp.amf.v0.AmfObject");
        dj.b bVarH = ((h) obj).h("code");
        s.f(bVarH, "null cannot be cast to non-null type com.pedro.rtmp.amf.v0.AmfString");
        return ((k) bVarH).g();
    }

    @Override // pj.a
    public String n() {
        Object obj = this.f50155j.get(3);
        s.f(obj, "null cannot be cast to non-null type com.pedro.rtmp.amf.v0.AmfObject");
        dj.b bVarH = ((h) obj).h("description");
        s.f(bVarH, "null cannot be cast to non-null type com.pedro.rtmp.amf.v0.AmfString");
        return ((k) bVarH).g();
    }

    @Override // pj.a
    public int p() {
        Object obj = this.f50155j.get(3);
        s.f(obj, "null cannot be cast to non-null type com.pedro.rtmp.amf.v0.AmfNumber");
        return (int) ((g) obj).g();
    }

    public final void t(dj.b amfData) {
        s.h(amfData, "amfData");
        this.f50155j.add(amfData);
        q(k() + amfData.a() + 1);
        b().h(k());
    }

    public String toString() {
        return "Command(name='" + o() + "', transactionId=" + m() + ", timeStamp=" + this.f50153h + ", streamId=" + this.f50154i + ", data=" + this.f50155j + ", bodySize=" + k() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String name, int i10, int i11, int i12, e basicHeader) {
        super(name, i10, i11, i12, basicHeader);
        s.h(name, "name");
        s.h(basicHeader, "basicHeader");
        this.f50153h = i11;
        this.f50154i = i12;
        ArrayList arrayList = new ArrayList();
        this.f50155j = arrayList;
        k kVar = new k(name);
        arrayList.add(kVar);
        q(k() + kVar.a() + 1);
        g gVar = new g(i10);
        q(k() + gVar.a() + 1);
        arrayList.add(gVar);
    }
}
