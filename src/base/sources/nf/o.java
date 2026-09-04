package nf;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f8.Ygx.FuoITeVPeXAj;
import gl.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f47608a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f47609b = s0.h("a", "an", "the", "and", "or", "but", "of", "to", "for", "with", "in", "on", "at", "by", "as", OGoz.iMozXWdZnYpFGt, "are", "was", "were", "be", "been", "am", "if", "than", "that", "el", "la", "los", "las", "un", "una", "unos", "unas", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "del", "y", "o", "pero", "con", "por", "para", "es", "son", "era", "eran", "o", "os", "as", com.mbridge.msdk.foundation.entity.b.JSON_KEY_DO, "da", "dos", "das", "um", "uma", "e", "ou", "mas", "com", "por", "para", "é", "são", "foi", "foram", "le", "les", "un", "une", "des", "du", "et", "ou", "mais", "avec", "pour", "par", "dans", "en", "au", "aux", "est", "sont", "der", "die", "das", "ein", "eine", "einen", C.LANGUAGE_UNDETERMINED, "oder", "aber", "von", "zu", "mit", "im", "ins", "am", "ans", "ist", "sind", "и", "или", "но", "в", "на", "с", "у", "к", "по", "от", "из", "для", "о");

    private o() {
    }

    private final m b(List list) {
        return new m(gl.r.l0(list, " ", null, null, 0, null, new Function1() { // from class: nf.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.c((of.h) obj);
            }
        }, 30, null), ((of.h) gl.r.b0(list)).b(), ((of.h) gl.r.n0(list)).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(of.h it) {
        kotlin.jvm.internal.s.h(it, "it");
        return it.c();
    }

    public static /* synthetic */ List e(o oVar, List list, int i10, long j10, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 5;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            j10 = 4000;
        }
        long j12 = j10;
        if ((i11 & 8) != 0) {
            j11 = 250;
        }
        return oVar.d(list, i12, j12, j11);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    public final List d(List words, int i10, long j10, long j11) {
        boolean z10;
        String strC;
        String strX0;
        kotlin.jvm.internal.s.h(words, "words");
        if (words.isEmpty()) {
            return gl.r.l();
        }
        float f10 = f(words);
        long jMax = Math.max((long) (1.8f * f10), j11);
        long jMax2 = Math.max((long) (f10 * 1.3f), j11);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jB = ((of.h) gl.r.b0(words)).b();
        Iterator it = words.iterator();
        while (it.hasNext()) {
            of.h hVar = (of.h) it.next();
            long jB2 = hVar.b() - jB;
            of.h hVar2 = (of.h) gl.r.d0(arrayList2);
            long jA = hVar.a() - (hVar2 != null ? hVar2.b() : hVar.b());
            ArrayList arrayList3 = arrayList2;
            boolean z11 = !arrayList3.isEmpty() && jB2 >= jMax;
            long j12 = jMax2;
            boolean z12 = arrayList2.size() >= 3 && jB2 >= j12;
            boolean z13 = arrayList2.size() >= i10;
            boolean z14 = !arrayList3.isEmpty() && jA > j10;
            of.h hVar3 = (of.h) gl.r.o0(arrayList2);
            if (hVar3 == null || (strC = hVar3.c()) == null) {
                z10 = false;
            } else {
                String lowerCase = strC.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
                if (lowerCase == null || (strX0 = bm.r.X0(lowerCase, '.', ',', '!', '?', ';', ':')) == null || !f47609b.contains(strX0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z14 || z13 || (!z10 && (z11 || z12))) {
                arrayList.add(b(arrayList2));
                arrayList2 = new ArrayList();
            }
            arrayList2.add(hVar);
            jB = hVar.a();
            jMax2 = j12;
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(b(arrayList2));
        }
        return arrayList;
    }

    private final long f(List list) {
        if (list.size() < 2) {
            return 150L;
        }
        ArrayList arrayList = new ArrayList(list.size() - 1);
        int size = list.size();
        for (int i10 = 1; i10 < size; i10++) {
            long jB = ((of.h) list.get(i10)).b() - ((of.h) list.get(i10 - 1)).a();
            if (jB >= 0) {
                arrayList.add(Long.valueOf(jB));
            }
        }
        if (arrayList.isEmpty()) {
            return 150L;
        }
        gl.r.x(arrayList);
        int size2 = arrayList.size() / 2;
        int size3 = arrayList.size() % 2;
        String str = FuoITeVPeXAj.oGqbLuHcM;
        if (size3 == 0) {
            long jLongValue = ((Number) arrayList.get(size2 - 1)).longValue();
            Object obj = arrayList.get(size2);
            kotlin.jvm.internal.s.g(obj, str);
            return (jLongValue + ((Number) obj).longValue()) / ((long) 2);
        }
        Object obj2 = arrayList.get(size2);
        kotlin.jvm.internal.s.g(obj2, str);
        return ((Number) obj2).longValue();
    }
}
