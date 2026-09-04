package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends xa.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f17804n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f17805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f17806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f17807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f17808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f17809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f17810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v0 f17811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f17812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f17813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f17814m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f17815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f17816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f17818d;

        public a(Uri uri, v0 v0Var, String str, String str2) {
            this.f17815a = uri;
            this.f17816b = v0Var;
            this.f17817c = str;
            this.f17818d = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f17819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f17820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f17822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f17823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f17824f;

        public b(Uri uri, v0 v0Var, String str, String str2, String str3, String str4) {
            this.f17819a = uri;
            this.f17820b = v0Var;
            this.f17821c = str;
            this.f17822d = str2;
            this.f17823e = str3;
            this.f17824f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new v0.b().U(MBridgeConstans.ENDCARD_URL_TYPE_PL).M(MimeTypes.APPLICATION_M3U8).G(), null, null, null, null);
        }

        public b a(v0 v0Var) {
            return new b(this.f17819a, v0Var, this.f17821c, this.f17822d, this.f17823e, this.f17824f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f17804n = new d("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public d(String str, List list, List list2, List list3, List list4, List list5, List list6, v0 v0Var, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        this.f17805d = Collections.unmodifiableList(e(list2, list3, list4, list5, list6));
        this.f17806e = Collections.unmodifiableList(list2);
        this.f17807f = Collections.unmodifiableList(list3);
        this.f17808g = Collections.unmodifiableList(list4);
        this.f17809h = Collections.unmodifiableList(list5);
        this.f17810i = Collections.unmodifiableList(list6);
        this.f17811j = v0Var;
        this.f17812k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f17813l = Collections.unmodifiableMap(map);
        this.f17814m = Collections.unmodifiableList(list8);
    }

    private static void a(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f17815a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static List c(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                qa.c cVar = (qa.c) list2.get(i12);
                if (cVar.f50519b == i10 && cVar.f50520c == i11) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static d d(String str) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new d("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List e(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((b) list.get(i10)).f17819a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list2, arrayList);
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        return arrayList;
    }

    @Override // qa.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d copy(List list) {
        String str = this.f56810a;
        List list2 = this.f56811b;
        List listC = c(this.f17806e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new d(str, list2, listC, list3, c(this.f17808g, 1, list), c(this.f17809h, 2, list), list3, this.f17811j, this.f17812k, this.f56812c, this.f17813l, this.f17814m);
    }
}
