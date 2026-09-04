package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d0 extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.ui.a f18625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f18626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f18627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private mb.b f18628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f18629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f18631g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18633a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f18633a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18633a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18633a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d0(Context context) {
        this(context, null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i10 = b.f18633a[alignment.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? TtmlNode.CENTER : TtmlNode.END;
        }
        return "start";
    }

    private static String d(mb.b bVar) {
        int i10 = bVar.f45416d;
        if (i10 == 1) {
            return r0.D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.google.android.exoplayer2.ui.b.b(bVar.f45417e));
        }
        if (i10 == 2) {
            return r0.D("0.1em 0.12em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f45417e));
        }
        if (i10 != 3) {
            return i10 != 4 ? "unset" : r0.D("-0.05em -0.05em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f45417e));
        }
        return r0.D("0.06em 0.08em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f45417e));
    }

    private String e(int i10, float f10) {
        float f11 = b0.f(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f11 == -3.4028235E38f ? "unset" : r0.D("%.2fpx", Float.valueOf(f11 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String h(bb.b bVar) {
        float f10 = bVar.f8757q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = bVar.f8756p;
        return r0.D("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:28:0x0109  */
    /* JADX WARN: Code duplicated, block: B:31:0x0124  */
    /* JADX WARN: Code duplicated, block: B:32:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x013e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0148  */
    /* JADX WARN: Code duplicated, block: B:43:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x015c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fa  */
    private void i() {
        float f10;
        String strD;
        int iB;
        boolean z10;
        String str;
        float f11;
        String strD2;
        int i10;
        int i11;
        String str2;
        String str3;
        Object obj;
        String str4;
        c.b bVarA;
        Layout.Alignment alignment;
        String str5;
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        float f12 = 1.2f;
        sb2.append(r0.D("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", com.google.android.exoplayer2.ui.b.b(this.f18628d.f45413a), e(this.f18630f, this.f18629e), Float.valueOf(1.2f), d(this.f18628d)));
        HashMap map = new HashMap();
        map.put(com.google.android.exoplayer2.ui.b.a("default_bg"), r0.D("background-color:%s;", com.google.android.exoplayer2.ui.b.b(this.f18628d.f45414b)));
        int i12 = 0;
        while (i12 < this.f18627c.size()) {
            bb.b bVar = (bb.b) this.f18627c.get(i12);
            float f13 = bVar.f8748h;
            float f14 = f13 != -3.4028235E38f ? f13 * 100.0f : 50.0f;
            int iB2 = b(bVar.f8749i);
            float f15 = bVar.f8745e;
            float f16 = f12;
            if (f15 != -3.4028235E38f) {
                if (bVar.f8746f != 1) {
                    String strD3 = r0.D("%.2f%%", Float.valueOf(f15 * 100.0f));
                    iB = bVar.f8756p == 1 ? -b(bVar.f8747g) : b(bVar.f8747g);
                    f10 = -3.4028235E38f;
                    str = strD3;
                    z10 = false;
                } else {
                    f10 = -3.4028235E38f;
                    if (f15 >= 0.0f) {
                        strD = r0.D("%.2fem", Float.valueOf(f15 * f16));
                        z10 = false;
                        iB = 0;
                    } else {
                        strD = r0.D("%.2fem", Float.valueOf(((-f15) - 1.0f) * f16));
                        iB = 0;
                        z10 = true;
                    }
                }
                f11 = bVar.f8750j;
                if (f11 != f10) {
                    strD2 = r0.D("%.2f%%", Float.valueOf(f11 * 100.0f));
                } else {
                    strD2 = "fit-content";
                }
                String str6 = strD2;
                String strC = c(bVar.f8742b);
                String strF = f(bVar.f8756p);
                String strE = e(bVar.f8754n, bVar.f8755o);
                if (bVar.f8752l) {
                    i10 = bVar.f8753m;
                } else {
                    i10 = this.f18628d.f45415c;
                }
                String strB = com.google.android.exoplayer2.ui.b.b(i10);
                i11 = bVar.f8756p;
                str2 = TtmlNode.RIGHT;
                if (i11 != 1) {
                    if (z10) {
                        str2 = TtmlNode.LEFT;
                    }
                    str3 = str2;
                    obj = "top";
                } else if (i11 != 2) {
                    str3 = z10 ? "bottom" : "top";
                    obj = TtmlNode.LEFT;
                } else {
                    if (!z10) {
                        str2 = TtmlNode.LEFT;
                    }
                    str3 = str2;
                    obj = "top";
                }
                if (i11 != 2 || i11 == 1) {
                    str4 = "height";
                    int i13 = iB;
                    iB = iB2;
                    iB2 = i13;
                } else {
                    str4 = "width";
                }
                String str7 = str4;
                bVarA = c.a(bVar.f8741a, getContext().getResources().getDisplayMetrics().density);
                for (String str8 : map.keySet()) {
                    str5 = (String) map.put(str8, (String) map.get(str8));
                    if (str5 != null || str5.equals(map.get(str8))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ob.a.g(z11);
                }
                sb2.append(r0.D("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i12), obj, Float.valueOf(f14), str3, str, str7, str6, strC, strF, strE, strB, Integer.valueOf(iB2), Integer.valueOf(iB), h(bVar)));
                sb2.append(r0.D("<span class='%s'>", "default_bg"));
                alignment = bVar.f8743c;
                if (alignment != null) {
                    sb2.append(r0.D("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb2.append(bVarA.f18615a);
                    sb2.append("</span>");
                } else {
                    sb2.append(bVarA.f18615a);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i12++;
                f12 = f16;
            } else {
                f10 = -3.4028235E38f;
                strD = r0.D("%.2f%%", Float.valueOf((1.0f - this.f18631g) * 100.0f));
                iB = -100;
                z10 = false;
            }
            str = strD;
            f11 = bVar.f8750j;
            if (f11 != f10) {
                strD2 = r0.D("%.2f%%", Float.valueOf(f11 * 100.0f));
            } else {
                strD2 = "fit-content";
            }
            String str9 = strD2;
            String strC2 = c(bVar.f8742b);
            String strF2 = f(bVar.f8756p);
            String strE2 = e(bVar.f8754n, bVar.f8755o);
            if (bVar.f8752l) {
                i10 = bVar.f8753m;
            } else {
                i10 = this.f18628d.f45415c;
            }
            String strB2 = com.google.android.exoplayer2.ui.b.b(i10);
            i11 = bVar.f8756p;
            str2 = TtmlNode.RIGHT;
            if (i11 != 1) {
                if (z10) {
                    str2 = TtmlNode.LEFT;
                }
                str3 = str2;
                obj = "top";
            } else if (i11 != 2) {
                str3 = z10 ? "bottom" : "top";
                obj = TtmlNode.LEFT;
            } else {
                if (!z10) {
                    str2 = TtmlNode.LEFT;
                }
                str3 = str2;
                obj = "top";
            }
            if (i11 != 2) {
                str4 = "height";
                int i14 = iB;
                iB = iB2;
                iB2 = i14;
            } else {
                str4 = "height";
                int i15 = iB;
                iB = iB2;
                iB2 = i15;
            }
            String str10 = str4;
            bVarA = c.a(bVar.f8741a, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str5 = (String) map.put(str8, (String) map.get(str8));
                if (str5 != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                ob.a.g(z11);
            }
            sb2.append(r0.D("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i12), obj, Float.valueOf(f14), str3, str, str10, str9, strC2, strF2, strE2, strB2, Integer.valueOf(iB2), Integer.valueOf(iB), h(bVar)));
            sb2.append(r0.D("<span class='%s'>", "default_bg"));
            alignment = bVar.f8743c;
            if (alignment != null) {
                sb2.append(r0.D("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                sb2.append(bVarA.f18615a);
                sb2.append("</span>");
            } else {
                sb2.append(bVarA.f18615a);
            }
            sb2.append("</span>");
            sb2.append("</div>");
            i12++;
            f12 = f16;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html><head><style>");
        for (String str11 : map.keySet()) {
            sb3.append(str11);
            sb3.append("{");
            sb3.append((String) map.get(str11));
            sb3.append("}");
        }
        sb3.append("</style></head>");
        sb2.insert(0, sb3.toString());
        this.f18626b.loadData(Base64.encodeToString(sb2.toString().getBytes(sc.e.f52294c), 1), "text/html", "base64");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List list, mb.b bVar, float f10, int i10, float f11) {
        this.f18628d = bVar;
        this.f18629e = f10;
        this.f18630f = i10;
        this.f18631g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            bb.b bVar2 = (bb.b) list.get(i11);
            if (bVar2.f8744d != null) {
                arrayList.add(bVar2);
            } else {
                arrayList2.add(bVar2);
            }
        }
        if (!this.f18627c.isEmpty() || !arrayList2.isEmpty()) {
            this.f18627c = arrayList2;
            i();
        }
        this.f18625a.a(arrayList, bVar, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f18626b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f18627c.isEmpty()) {
            return;
        }
        i();
    }

    public d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18627c = Collections.EMPTY_LIST;
        this.f18628d = mb.b.f45412g;
        this.f18629e = 0.0533f;
        this.f18630f = 0;
        this.f18631g = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.f18625a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f18626b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
