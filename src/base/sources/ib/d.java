package ib;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f41278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f41279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f41280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f41281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f41282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f41283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap f41284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap f41285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f41286m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f41274a = str;
        this.f41275b = str2;
        this.f41282i = str4;
        this.f41279f = gVar;
        this.f41280g = strArr;
        this.f41276c = str2 != null;
        this.f41277d = j10;
        this.f41278e = j11;
        this.f41281h = (String) ob.a.e(str3);
        this.f41283j = dVar;
        this.f41284k = new HashMap();
        this.f41285l = new HashMap();
    }

    private void b(Map map, bb.b.C0112b c0112b, int i10, int i11, int i12) {
        g gVarF = f.f(this.f41279f, this.f41280g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0112b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0112b.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f41283j, map, i12);
            if (TtmlNode.TAG_P.equals(this.f41274a)) {
                if (gVarF.k() != Float.MAX_VALUE) {
                    c0112b.m((gVarF.k() * (-90.0f)) / 100.0f);
                }
                if (gVarF.m() != null) {
                    c0112b.p(gVarF.m());
                }
                if (gVarF.h() != null) {
                    c0112b.j(gVarF.h());
                }
            }
        }
    }

    public static d c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet treeSet, boolean z10) {
        boolean zEquals = TtmlNode.TAG_P.equals(this.f41274a);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(this.f41274a);
        if (z10 || zEquals || (zEquals2 && this.f41282i != null)) {
            long j10 = this.f41277d;
            if (j10 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f41278e;
            if (j11 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f41286m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f41286m.size(); i10++) {
            ((d) this.f41286m.get(i10)).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map map) {
        if (!map.containsKey(str)) {
            bb.b.C0112b c0112b = new bb.b.C0112b();
            c0112b.o(new SpannableStringBuilder());
            map.put(str, c0112b);
        }
        return (SpannableStringBuilder) ob.a.e(((bb.b.C0112b) map.get(str)).e());
    }

    private void n(long j10, String str, List list) {
        if (!"".equals(this.f41281h)) {
            str = this.f41281h;
        }
        if (m(j10) && TtmlNode.TAG_DIV.equals(this.f41274a) && this.f41282i != null) {
            list.add(new Pair(str, this.f41282i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map map, Map map2, String str, Map map3) {
        if (m(j10)) {
            String str2 = "".equals(this.f41281h) ? str : this.f41281h;
            Iterator it = this.f41285l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f41284k.containsKey(str3) ? ((Integer) this.f41284k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (bb.b.C0112b) ob.a.e((bb.b.C0112b) map3.get(str3)), iIntValue, iIntValue2, ((e) ob.a.e((e) map2.get(str2))).f41296j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map map) {
        this.f41284k.clear();
        this.f41285l.clear();
        if (TtmlNode.TAG_METADATA.equals(this.f41274a)) {
            return;
        }
        if (!"".equals(this.f41281h)) {
            str = this.f41281h;
        }
        String str2 = str;
        if (this.f41276c && z10) {
            k(str2, map).append((CharSequence) ob.a.e(this.f41275b));
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.f41274a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f41284k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) ob.a.e(((bb.b.C0112b) entry.getValue()).e())).length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(this.f41274a);
            int i10 = 0;
            while (i10 < g()) {
                f(i10).p(j10, z10 || zEquals, str2, map);
                i10++;
                j10 = j10;
                map = map;
            }
            Map map2 = map;
            if (zEquals) {
                f.c(k(str2, map2));
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                this.f41285l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) ob.a.e(((bb.b.C0112b) entry2.getValue()).e())).length()));
            }
        }
    }

    public void a(d dVar) {
        if (this.f41286m == null) {
            this.f41286m = new ArrayList();
        }
        this.f41286m.add(dVar);
    }

    public d f(int i10) {
        List list = this.f41286m;
        if (list != null) {
            return (d) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List list = this.f41286m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List h(long j10, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        n(j10, this.f41281h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f41281h, treeMap);
        o(j10, map, map2, this.f41281h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) ob.a.e((e) map2.get(pair.first));
                arrayList2.add(new bb.b.C0112b().f(bitmapDecodeByteArray).k(eVar.f41288b).l(0).h(eVar.f41289c, 0).i(eVar.f41291e).n(eVar.f41292f).g(eVar.f41293g).r(eVar.f41296j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) ob.a.e((e) map2.get(entry.getKey()));
            bb.b.C0112b c0112b = (bb.b.C0112b) entry.getValue();
            e((SpannableStringBuilder) ob.a.e(c0112b.e()));
            c0112b.h(eVar2.f41289c, eVar2.f41290d);
            c0112b.i(eVar2.f41291e);
            c0112b.k(eVar2.f41288b);
            c0112b.n(eVar2.f41292f);
            c0112b.q(eVar2.f41295i, eVar2.f41294h);
            c0112b.r(eVar2.f41296j);
            arrayList2.add(c0112b.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f41280g;
    }

    public boolean m(long j10) {
        long j11 = this.f41277d;
        if (j11 == C.TIME_UNSET && this.f41278e == C.TIME_UNSET) {
            return true;
        }
        if (j11 <= j10 && this.f41278e == C.TIME_UNSET) {
            return true;
        }
        if (j11 != C.TIME_UNSET || j10 >= this.f41278e) {
            return j11 <= j10 && j10 < this.f41278e;
        }
        return true;
    }
}
