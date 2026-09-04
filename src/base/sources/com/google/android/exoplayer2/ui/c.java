package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.common.collect.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import ob.r0;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f18614a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f18616b;

        private b(String str, Map map) {
            this.f18615a = str;
            this.f18616b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0292c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator f18617e = new Comparator() { // from class: com.google.android.exoplayer2.ui.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.C0292c.a((c.C0292c) obj, (c.C0292c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator f18618f = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.C0292c.b((c.C0292c) obj, (c.C0292c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f18622d;

        public static /* synthetic */ int a(C0292c c0292c, C0292c c0292c2) {
            int iCompare = Integer.compare(c0292c2.f18620b, c0292c.f18620b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = c0292c.f18621c.compareTo(c0292c2.f18621c);
            return iCompareTo != 0 ? iCompareTo : c0292c.f18622d.compareTo(c0292c2.f18622d);
        }

        public static /* synthetic */ int b(C0292c c0292c, C0292c c0292c2) {
            int iCompare = Integer.compare(c0292c2.f18619a, c0292c.f18619a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = c0292c2.f18621c.compareTo(c0292c.f18621c);
            return iCompareTo != 0 ? iCompareTo : c0292c2.f18622d.compareTo(c0292c.f18622d);
        }

        private C0292c(int i10, int i11, String str, String str2) {
            this.f18619a = i10;
            this.f18620b = i11;
            this.f18621c = str;
            this.f18622d = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f18623a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f18624b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", e0.q());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), e0.q());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(com.google.android.exoplayer2.ui.b.a("bg_" + iIntValue), r0.D("background-color:%s;", com.google.android.exoplayer2.ui.b.b(iIntValue)));
        }
        SparseArray sparseArrayC = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, iKeyAt)));
            d dVar = (d) sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f18624b, C0292c.f18618f);
            Iterator it2 = dVar.f18624b.iterator();
            while (it2.hasNext()) {
                sb2.append(((C0292c) it2.next()).f18622d);
            }
            Collections.sort(dVar.f18623a, C0292c.f18617e);
            Iterator it3 = dVar.f18623a.iterator();
            while (it3.hasNext()) {
                sb2.append(((C0292c) it3.next()).f18621c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f18614a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray c(Spanned spanned, float f10) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f10);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                ob.a.e(strD);
                C0292c c0292c = new C0292c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f18623a.add(c0292c);
                f(sparseArray, spanEnd).f18624b.add(c0292c);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof fb.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof fb.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof fb.c) {
                return "<rt>" + b(((fb.c) obj).f38451a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return r0.D("<span style='color:%s;'>", com.google.android.exoplayer2.ui.b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return r0.D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof fb.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return r0.D("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return r0.D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return r0.D("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof fb.c)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof fb.e)) {
                return null;
            }
            fb.e eVar = (fb.e) obj;
            return r0.D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(eVar.f38453a, eVar.f38454b), g(eVar.f38455c));
        }
        int i10 = ((fb.c) obj).f38452b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray sparseArray, int i10) {
        d dVar = (d) sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append(NpmRNZ.CJHZfqc);
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append(DevicePublicKeyStringDef.NONE);
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
