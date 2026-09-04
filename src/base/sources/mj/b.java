package mj;

import android.util.Log;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends mj.a {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46361b;

        static {
            int[] iArr = new int[ji.m.values().length];
            try {
                iArr[ji.m.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ji.m.H265.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ji.m.AV1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46360a = iArr;
            int[] iArr2 = new int[ji.a.values().length];
            try {
                iArr2[ji.a.G711.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ji.a.AAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ji.a.OPUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f46361b = iArr2;
        }
    }

    @Override // mj.a
    public void F(OutputStream output) throws IOException {
        kotlin.jvm.internal.s.h(output, "output");
        S(g() + 1);
        pj.b bVar = new pj.b("closeStream", g(), h(), r(), new oj.e(nj.b.TYPE_0, nj.a.OVER_STREAM.g()));
        bVar.t(new dj.f());
        bVar.j(output);
        bVar.i(output);
        q().d(g(), "closeStream");
        Log.i(t(), "send " + bVar);
    }

    @Override // mj.a
    public void H(String auth, OutputStream output) throws IOException {
        kotlin.jvm.internal.s.h(auth, "auth");
        kotlin.jvm.internal.s.h(output, "output");
        S(g() + 1);
        pj.b bVar = new pj.b("connect", g(), h(), r(), new oj.e(nj.b.TYPE_0, nj.a.OVER_CONNECTION.g()));
        dj.h hVar = new dj.h(null, 1, null);
        hVar.l(MBridgeConstans.DYNAMIC_VIEW_WX_APP, d() + auth);
        hVar.l("flashVer", i());
        hVar.l("tcUrl", u() + auth);
        if (!x()) {
            if (w() == ji.m.H265) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new dj.k(VisualSampleEntry.TYPE6));
                hVar.k("fourCcList", new dj.j(arrayList));
            } else if (w() == ji.m.AV1) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new dj.k("av01"));
                hVar.k("fourCcList", new dj.j(arrayList2));
            }
        }
        hVar.j("objectEncoding", 0.0d);
        bVar.t(hVar);
        bVar.j(output);
        bVar.i(output);
        q().d(g(), "connect");
        Log.i(t(), "send " + bVar);
    }

    @Override // mj.a
    public void J(OutputStream output) throws IOException {
        int iG;
        int iG2;
        kotlin.jvm.internal.s.h(output, "output");
        rj.b bVar = new rj.b("@setDataFrame", h(), r(), null, 8, null);
        bVar.m(new dj.k("onMetaData"));
        dj.d dVar = new dj.d(null, 1, null);
        dVar.j("duration", 0.0d);
        if (!x()) {
            dVar.j("width", y());
            dVar.j("height", k());
            int i10 = a.f46360a[w().ordinal()];
            if (i10 == 1) {
                iG2 = jj.c.AVC.g();
            } else if (i10 == 2) {
                iG2 = jj.c.HEVC.g();
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iG2 = jj.c.AV1.g();
            }
            dVar.j("videocodecid", iG2);
            dVar.j("framerate", j());
            dVar.j("videodatarate", 0.0d);
        }
        if (!f()) {
            int i11 = a.f46361b[e().ordinal()];
            if (i11 == 1) {
                iG = gj.a.G711_A.g();
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException("Unsupported codec: " + e().name());
                }
                iG = gj.a.AAC.g();
            }
            dVar.j("audiocodecid", iG);
            dVar.j("audiosamplerate", p());
            dVar.j("audiosamplesize", 16.0d);
            dVar.j("audiodatarate", 0.0d);
            dVar.m("stereo", z());
        }
        dVar.j("filesize", 0.0d);
        bVar.m(dVar);
        bVar.j(output);
        bVar.i(output);
        Log.i(t(), "send " + bVar);
    }

    @Override // mj.a
    public void M(OutputStream output) throws IOException {
        kotlin.jvm.internal.s.h(output, "output");
        S(g() + 1);
        pj.b bVar = new pj.b("publish", g(), h(), r(), new oj.e(nj.b.TYPE_0, nj.a.OVER_STREAM.g()));
        bVar.t(new dj.f());
        bVar.t(new dj.k(s()));
        bVar.t(new dj.k("live"));
        bVar.j(output);
        bVar.i(output);
        q().d(g(), "publish");
        Log.i(t(), "send " + bVar);
    }

    @Override // mj.a
    public void c(OutputStream output) throws IOException {
        kotlin.jvm.internal.s.h(output, "output");
        S(g() + 1);
        int iG = g();
        int iH = h();
        int iR = r();
        nj.b bVar = nj.b.TYPE_0;
        nj.a aVar = nj.a.OVER_STREAM;
        pj.b bVar2 = new pj.b("releaseStream", iG, iH, iR, new oj.e(bVar, aVar.g()));
        bVar2.t(new dj.f());
        bVar2.t(new dj.k(s()));
        bVar2.j(output);
        bVar2.i(output);
        q().d(g(), "releaseStream");
        Log.i(t(), "send " + bVar2);
        S(g() + 1);
        pj.b bVar3 = new pj.b("FCPublish", g(), h(), r(), new oj.e(bVar, aVar.g()));
        bVar3.t(new dj.f());
        bVar3.t(new dj.k(s()));
        bVar3.j(output);
        bVar3.i(output);
        q().d(g(), "FCPublish");
        Log.i(t(), "send " + bVar3);
        S(g() + 1);
        pj.b bVar4 = new pj.b("createStream", g(), h(), r(), new oj.e(bVar, nj.a.OVER_CONNECTION.g()));
        bVar4.t(new dj.f());
        bVar4.j(output);
        bVar4.i(output);
        q().d(g(), "createStream");
        Log.i(t(), "send " + bVar4);
    }
}
