package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionLayout f2317a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MotionEvent f2329m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MotionLayout.f f2332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final t f2334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f2335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f2336t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.h f2318b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f2319c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2320d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f2321e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f2322f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f2323g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SparseArray f2324h = new SparseArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap f2325i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseIntArray f2326j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2327k = 400;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2328l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2330n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2331o = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v.c f2337a;

        a(v.c cVar) {
            this.f2337a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f2337a.a(f10);
        }
    }

    p(Context context, MotionLayout motionLayout, int i10) {
        this.f2317a = motionLayout;
        this.f2334r = new t(motionLayout);
        K(context, i10);
        SparseArray sparseArray = this.f2324h;
        int i11 = androidx.constraintlayout.widget.e.f2789a;
        sparseArray.put(i11, new androidx.constraintlayout.widget.c());
        this.f2325i.put("motion_base", Integer.valueOf(i11));
    }

    private boolean I(int i10) {
        int i11 = this.f2326j.get(i10);
        int size = this.f2326j.size();
        while (i11 > 0) {
            if (i11 == i10) {
                return true;
            }
            int i12 = size - 1;
            if (size < 0) {
                return true;
            }
            i11 = this.f2326j.get(i11);
            size = i12;
        }
        return false;
    }

    private boolean J() {
        return this.f2332p != null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void K(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                L(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.f2349k.add(gVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                N(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                this.f2334r.a(new s(context, xml));
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                ArrayList arrayList = this.f2321e;
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.f2319c == null && !bVar.f2340b) {
                                    this.f2319c = bVar;
                                    if (bVar.f2350l != null) {
                                        this.f2319c.f2350l.x(this.f2333q);
                                    }
                                }
                                if (bVar.f2340b) {
                                    if (bVar.f2341c == -1) {
                                        this.f2322f = bVar;
                                    } else {
                                        this.f2323g.add(bVar);
                                    }
                                    this.f2321e.remove(bVar);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && bVar != null && !this.f2317a.isInEditMode()) {
                                bVar.u(context, xml);
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (bVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i10) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (bVar != null) {
                                    bVar.f2350l = new q(context, this.f2317a, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                O(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f2318b = new androidx.constraintlayout.widget.h(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                N(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e11);
        }
    }

    private int L(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.Q(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iR = -1;
        int iR2 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iR2 = r(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        cVar.f2686e = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                cVar.f2686e = 4;
                                break;
                            case "left":
                                cVar.f2686e = 2;
                                break;
                            case "none":
                                cVar.f2686e = 0;
                                break;
                            case "right":
                                cVar.f2686e = 1;
                                break;
                            case "x_right":
                                cVar.f2686e = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iR = r(context, attributeValue);
                    this.f2325i.put(a0(attributeValue), Integer.valueOf(iR));
                    cVar.f2683b = androidx.constraintlayout.motion.widget.a.c(context, iR);
                    break;
                case "stateLabels":
                    cVar.R(attributeValue);
                    break;
            }
        }
        if (iR != -1) {
            if (this.f2317a.W != 0) {
                cVar.S(true);
            }
            cVar.D(context, xmlPullParser);
            if (iR2 != -1) {
                this.f2326j.put(iR, iR2);
            }
            this.f2324h.put(iR, cVar);
        }
        return iR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int M(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return L(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e10);
            return -1;
        } catch (XmlPullParserException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e11);
            return -1;
        }
    }

    private void N(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.f.Fb);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == androidx.constraintlayout.widget.f.Gb) {
                M(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void O(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.f.V9);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == androidx.constraintlayout.widget.f.W9) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f2327k);
                this.f2327k = i11;
                if (i11 < 8) {
                    this.f2327k = 8;
                }
            } else if (index == androidx.constraintlayout.widget.f.X9) {
                this.f2328l = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void S(int i10, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) this.f2324h.get(i10);
        cVar.f2684c = cVar.f2683b;
        int i11 = this.f2326j.get(i10);
        if (i11 > 0) {
            S(i11, motionLayout);
            androidx.constraintlayout.widget.c cVar2 = (androidx.constraintlayout.widget.c) this.f2324h.get(i11);
            if (cVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + androidx.constraintlayout.motion.widget.a.c(this.f2317a.getContext(), i11));
                return;
            }
            cVar.f2684c += "/" + cVar2.f2684c;
            cVar.L(cVar2);
        } else {
            cVar.f2684c += "  layout";
            cVar.K(motionLayout);
        }
        cVar.h(cVar);
    }

    public static String a0(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    private int r(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    private int y(int i10) {
        int iC;
        androidx.constraintlayout.widget.h hVar = this.f2318b;
        return (hVar == null || (iC = hVar.c(i10, -1, -1)) == -1) ? i10 : iC;
    }

    float A() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0.0f;
        }
        return this.f2319c.f2350l.l();
    }

    float B() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0.0f;
        }
        return this.f2319c.f2350l.m();
    }

    float C() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0.0f;
        }
        return this.f2319c.f2350l.n();
    }

    float D() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0.0f;
        }
        return this.f2319c.f2350l.o();
    }

    public float E() {
        b bVar = this.f2319c;
        if (bVar != null) {
            return bVar.f2347i;
        }
        return 0.0f;
    }

    int F() {
        b bVar = this.f2319c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2342d;
    }

    public b G(int i10) {
        ArrayList arrayList = this.f2321e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar.f2339a == i10) {
                return bVar;
            }
        }
        return null;
    }

    public List H(int i10) {
        int iY = y(i10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f2321e;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar.f2342d == iY || bVar.f2341c == iY) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    void P(float f10, float f11) {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return;
        }
        this.f2319c.f2350l.u(f10, f11);
    }

    void Q(float f10, float f11) {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return;
        }
        this.f2319c.f2350l.v(f10, f11);
    }

    void R(MotionEvent motionEvent, int i10, MotionLayout motionLayout) {
        MotionLayout.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f2332p == null) {
            this.f2332p = this.f2317a.w0();
        }
        this.f2332p.b(motionEvent);
        if (i10 != -1) {
            int action = motionEvent.getAction();
            boolean z10 = false;
            if (action == 0) {
                this.f2335s = motionEvent.getRawX();
                this.f2336t = motionEvent.getRawY();
                this.f2329m = motionEvent;
                this.f2330n = false;
                if (this.f2319c.f2350l != null) {
                    RectF rectFF = this.f2319c.f2350l.f(this.f2317a, rectF);
                    if (rectFF != null && !rectFF.contains(this.f2329m.getX(), this.f2329m.getY())) {
                        this.f2329m = null;
                        this.f2330n = true;
                        return;
                    }
                    RectF rectFP = this.f2319c.f2350l.p(this.f2317a, rectF);
                    if (rectFP == null || rectFP.contains(this.f2329m.getX(), this.f2329m.getY())) {
                        this.f2331o = false;
                    } else {
                        this.f2331o = true;
                    }
                    this.f2319c.f2350l.w(this.f2335s, this.f2336t);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f2330n) {
                float rawY = motionEvent.getRawY() - this.f2336t;
                float rawX = motionEvent.getRawX() - this.f2335s;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f2329m) == null) {
                    return;
                }
                b bVarI = i(i10, rawX, rawY, motionEvent2);
                if (bVarI != null) {
                    motionLayout.setTransition(bVarI);
                    RectF rectFP2 = this.f2319c.f2350l.p(this.f2317a, rectF);
                    if (rectFP2 != null && !rectFP2.contains(this.f2329m.getX(), this.f2329m.getY())) {
                        z10 = true;
                    }
                    this.f2331o = z10;
                    this.f2319c.f2350l.z(this.f2335s, this.f2336t);
                }
            }
        }
        if (this.f2330n) {
            return;
        }
        b bVar = this.f2319c;
        if (bVar != null && bVar.f2350l != null && !this.f2331o) {
            this.f2319c.f2350l.s(motionEvent, this.f2332p, i10, this);
        }
        this.f2335s = motionEvent.getRawX();
        this.f2336t = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (fVar = this.f2332p) == null) {
            return;
        }
        fVar.a();
        this.f2332p = null;
        int i11 = motionLayout.E;
        if (i11 != -1) {
            h(motionLayout, i11);
        }
    }

    void T(MotionLayout motionLayout) {
        for (int i10 = 0; i10 < this.f2324h.size(); i10++) {
            int iKeyAt = this.f2324h.keyAt(i10);
            if (I(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            S(iKeyAt, motionLayout);
        }
    }

    public void U(int i10, androidx.constraintlayout.widget.c cVar) {
        this.f2324h.put(i10, cVar);
    }

    public void V(int i10) {
        b bVar = this.f2319c;
        if (bVar != null) {
            bVar.E(i10);
        } else {
            this.f2327k = i10;
        }
    }

    public void W(boolean z10) {
        this.f2333q = z10;
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return;
        }
        this.f2319c.f2350l.x(this.f2333q);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0075 A[SYNTHETIC] */
    void X(int i10, int i11) {
        int iC;
        int iC2;
        b bVar;
        ArrayList arrayList;
        int size;
        int i12;
        int i13;
        b bVar2;
        ArrayList arrayList2;
        int size2;
        b bVar3;
        b bVar4;
        b bVar5;
        androidx.constraintlayout.widget.h hVar = this.f2318b;
        if (hVar != null) {
            iC = hVar.c(i10, -1, -1);
            if (iC == -1) {
                iC = i10;
            }
            iC2 = this.f2318b.c(i11, -1, -1);
            if (iC2 == -1) {
            }
            bVar = this.f2319c;
            if (bVar == null && bVar.f2341c == i11 && this.f2319c.f2342d == i10) {
                return;
            }
            arrayList = this.f2321e;
            size = arrayList.size();
            i12 = 0;
            i13 = 0;
            while (true) {
                if (i13 < size) {
                    bVar2 = this.f2322f;
                    arrayList2 = this.f2323g;
                    size2 = arrayList2.size();
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        bVar4 = (b) obj;
                        if (bVar4.f2341c == i11) {
                            bVar2 = bVar4;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.f2342d = iC;
                    bVar3.f2341c = iC2;
                    if (iC != -1) {
                        this.f2321e.add(bVar3);
                    }
                    this.f2319c = bVar3;
                    return;
                }
                Object obj2 = arrayList.get(i13);
                i13++;
                bVar5 = (b) obj2;
                if ((bVar5.f2341c != iC2 && bVar5.f2342d == iC) || (bVar5.f2341c == i11 && bVar5.f2342d == i10)) {
                    break;
                }
            }
            this.f2319c = bVar5;
            if (bVar5 != null || bVar5.f2350l == null) {
            }
            this.f2319c.f2350l.x(this.f2333q);
            return;
        }
        iC = i10;
        iC2 = i11;
        bVar = this.f2319c;
        if (bVar == null) {
        }
        arrayList = this.f2321e;
        size = arrayList.size();
        i12 = 0;
        i13 = 0;
        while (true) {
            if (i13 < size) {
                bVar2 = this.f2322f;
                arrayList2 = this.f2323g;
                size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    bVar4 = (b) obj3;
                    if (bVar4.f2341c == i11) {
                        bVar2 = bVar4;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.f2342d = iC;
                bVar3.f2341c = iC2;
                if (iC != -1) {
                    this.f2321e.add(bVar3);
                }
                this.f2319c = bVar3;
                return;
            }
            Object obj4 = arrayList.get(i13);
            i13++;
            bVar5 = (b) obj4;
            if (bVar5.f2341c != iC2) {
            }
        }
        this.f2319c = bVar5;
        if (bVar5 != null) {
        }
    }

    public void Y(b bVar) {
        this.f2319c = bVar;
        if (bVar == null || bVar.f2350l == null) {
            return;
        }
        this.f2319c.f2350l.x(this.f2333q);
    }

    void Z() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return;
        }
        this.f2319c.f2350l.A();
    }

    boolean b0() {
        ArrayList arrayList = this.f2321e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((b) obj).f2350l != null) {
                return true;
            }
        }
        b bVar = this.f2319c;
        return (bVar == null || bVar.f2350l == null) ? false : true;
    }

    public void c0(int i10, View... viewArr) {
        this.f2334r.i(i10, viewArr);
    }

    public void f(MotionLayout motionLayout, int i10) {
        ArrayList arrayList = this.f2321e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar.f2351m.size() > 0) {
                ArrayList arrayList2 = bVar.f2351m;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    ((b.a) obj2).c(motionLayout);
                }
            }
        }
        ArrayList arrayList3 = this.f2323g;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList3.get(i13);
            i13++;
            b bVar2 = (b) obj3;
            if (bVar2.f2351m.size() > 0) {
                ArrayList arrayList4 = bVar2.f2351m;
                int size4 = arrayList4.size();
                int i14 = 0;
                while (i14 < size4) {
                    Object obj4 = arrayList4.get(i14);
                    i14++;
                    ((b.a) obj4).c(motionLayout);
                }
            }
        }
        ArrayList arrayList5 = this.f2321e;
        int size5 = arrayList5.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj5 = arrayList5.get(i15);
            i15++;
            b bVar3 = (b) obj5;
            if (bVar3.f2351m.size() > 0) {
                ArrayList arrayList6 = bVar3.f2351m;
                int size6 = arrayList6.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList6.get(i16);
                    i16++;
                    ((b.a) obj6).a(motionLayout, i10, bVar3);
                }
            }
        }
        ArrayList arrayList7 = this.f2323g;
        int size7 = arrayList7.size();
        int i17 = 0;
        while (i17 < size7) {
            Object obj7 = arrayList7.get(i17);
            i17++;
            b bVar4 = (b) obj7;
            if (bVar4.f2351m.size() > 0) {
                ArrayList arrayList8 = bVar4.f2351m;
                int size8 = arrayList8.size();
                int i18 = 0;
                while (i18 < size8) {
                    Object obj8 = arrayList8.get(i18);
                    i18++;
                    ((b.a) obj8).a(motionLayout, i10, bVar4);
                }
            }
        }
    }

    public boolean g(int i10, m mVar) {
        return this.f2334r.d(i10, mVar);
    }

    boolean h(MotionLayout motionLayout, int i10) {
        b bVar;
        if (J() || this.f2320d) {
            return false;
        }
        ArrayList arrayList = this.f2321e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar2 = (b) obj;
            if (bVar2.f2352n != 0 && ((bVar = this.f2319c) != bVar2 || !bVar.D(2))) {
                if (i10 == bVar2.f2342d && (bVar2.f2352n == 4 || bVar2.f2352n == 2)) {
                    MotionLayout.j jVar = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f2352n == 4) {
                        motionLayout.G0();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.i0(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar);
                        motionLayout.x0();
                    }
                    return true;
                }
                if (i10 == bVar2.f2341c && (bVar2.f2352n == 3 || bVar2.f2352n == 1)) {
                    MotionLayout.j jVar2 = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f2352n == 3) {
                        motionLayout.I0();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.i0(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar2);
                        motionLayout.x0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b i(int i10, float f10, float f11, MotionEvent motionEvent) {
        if (i10 == -1) {
            return this.f2319c;
        }
        List<b> listH = H(i10);
        RectF rectF = new RectF();
        float f12 = 0.0f;
        b bVar = null;
        for (b bVar2 : listH) {
            if (!bVar2.f2353o && bVar2.f2350l != null) {
                bVar2.f2350l.x(this.f2333q);
                RectF rectFP = bVar2.f2350l.p(this.f2317a, rectF);
                if (rectFP == null || motionEvent == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFF = bVar2.f2350l.f(this.f2317a, rectF);
                    if (rectFF == null || motionEvent == null || rectFF.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.f2350l.a(f10, f11);
                        if (bVar2.f2350l.f2371l && motionEvent != null) {
                            float x10 = motionEvent.getX() - bVar2.f2350l.f2368i;
                            float y10 = motionEvent.getY() - bVar2.f2350l.f2369j;
                            fA = ((float) (Math.atan2(f11 + y10, f10 + x10) - Math.atan2(x10, y10))) * 10.0f;
                        }
                        float f13 = fA * (bVar2.f2341c == i10 ? -1.0f : 1.1f);
                        if (f13 > f12) {
                            bVar = bVar2;
                            f12 = f13;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public int j() {
        b bVar = this.f2319c;
        if (bVar != null) {
            return bVar.f2354p;
        }
        return -1;
    }

    int k() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0;
        }
        return this.f2319c.f2350l.d();
    }

    androidx.constraintlayout.widget.c l(int i10) {
        return m(i10, -1, -1);
    }

    androidx.constraintlayout.widget.c m(int i10, int i11, int i12) {
        int iC;
        androidx.constraintlayout.widget.h hVar = this.f2318b;
        if (hVar != null && (iC = hVar.c(i10, i11, i12)) != -1) {
            i10 = iC;
        }
        if (this.f2324h.get(i10) != null) {
            return (androidx.constraintlayout.widget.c) this.f2324h.get(i10);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + androidx.constraintlayout.motion.widget.a.c(this.f2317a.getContext(), i10) + " In MotionScene");
        SparseArray sparseArray = this.f2324h;
        return (androidx.constraintlayout.widget.c) sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] n() {
        int size = this.f2324h.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f2324h.keyAt(i10);
        }
        return iArr;
    }

    public ArrayList o() {
        return this.f2321e;
    }

    public int p() {
        b bVar = this.f2319c;
        return bVar != null ? bVar.f2346h : this.f2327k;
    }

    int q() {
        b bVar = this.f2319c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f2341c;
    }

    public Interpolator s() {
        int i10 = this.f2319c.f2343e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f2317a.getContext(), this.f2319c.f2345g);
        }
        if (i10 == -1) {
            return new a(v.c.c(this.f2319c.f2344f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void t(m mVar) {
        b bVar = this.f2319c;
        int i10 = 0;
        if (bVar != null) {
            ArrayList arrayList = bVar.f2349k;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((g) obj).b(mVar);
            }
            return;
        }
        b bVar2 = this.f2322f;
        if (bVar2 != null) {
            ArrayList arrayList2 = bVar2.f2349k;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((g) obj2).b(mVar);
            }
        }
    }

    float u() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0.0f;
        }
        return this.f2319c.f2350l.g();
    }

    float v() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0.0f;
        }
        return this.f2319c.f2350l.h();
    }

    boolean w() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return false;
        }
        return this.f2319c.f2350l.i();
    }

    float x(float f10, float f11) {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0.0f;
        }
        return this.f2319c.f2350l.j(f10, f11);
    }

    int z() {
        b bVar = this.f2319c;
        if (bVar == null || bVar.f2350l == null) {
            return 0;
        }
        return this.f2319c.f2350l.k();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f2342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f2343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f2344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f2345g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2346h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f2347i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final p f2348j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ArrayList f2349k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private q f2350l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ArrayList f2351m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f2352n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f2353o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f2354p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f2355q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f2356r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes2.dex */
        public static class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f2357a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f2358b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f2359c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f2358b = -1;
                this.f2359c = 17;
                this.f2357a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.f.f2828ca);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == androidx.constraintlayout.widget.f.f2854ea) {
                        this.f2358b = typedArrayObtainStyledAttributes.getResourceId(index, this.f2358b);
                    } else if (index == androidx.constraintlayout.widget.f.f2841da) {
                        this.f2359c = typedArrayObtainStyledAttributes.getInt(index, this.f2359c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f2357a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i10 = bVar2.f2341c;
                int i11 = this.f2357a.f2342d;
                if (i11 == -1) {
                    return motionLayout.E != i10;
                }
                int i12 = motionLayout.E;
                return i12 == i11 || i12 == i10;
            }

            public void c(MotionLayout motionLayout) {
                int i10 = this.f2358b;
                if (i10 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i10);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f2358b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f2357a.f2348j.f2317a;
                if (motionLayout.v0()) {
                    if (this.f2357a.f2342d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.J0(this.f2357a.f2341c);
                            return;
                        }
                        b bVar = new b(this.f2357a.f2348j, this.f2357a);
                        bVar.f2342d = currentState;
                        bVar.f2341c = this.f2357a.f2341c;
                        motionLayout.setTransition(bVar);
                        motionLayout.G0();
                        return;
                    }
                    b bVar2 = this.f2357a.f2348j.f2319c;
                    int i10 = this.f2359c;
                    boolean z10 = false;
                    boolean z11 = ((i10 & 1) == 0 && (i10 & 256) == 0) ? false : true;
                    boolean z12 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z11 && z12) {
                        b bVar3 = this.f2357a.f2348j.f2319c;
                        b bVar4 = this.f2357a;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z12 = false;
                            z10 = z11;
                        }
                    } else {
                        z10 = z11;
                    }
                    if (b(bVar2, motionLayout)) {
                        if (z10 && (this.f2359c & 1) != 0) {
                            motionLayout.setTransition(this.f2357a);
                            motionLayout.G0();
                            return;
                        }
                        if (z12 && (this.f2359c & 16) != 0) {
                            motionLayout.setTransition(this.f2357a);
                            motionLayout.I0();
                        } else if (z10 && (this.f2359c & 256) != 0) {
                            motionLayout.setTransition(this.f2357a);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z12 || (this.f2359c & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f2357a);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }

            public void a(MotionLayout motionLayout, int i10, b bVar) {
                boolean z10;
                View viewFindViewById;
                int i11 = this.f2358b;
                View view = motionLayout;
                if (i11 != -1) {
                    viewFindViewById = motionLayout.findViewById(i11);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e("MotionScene", qEagQqzJZsd.auGpguUa + this.f2358b);
                    return;
                }
                int i12 = bVar.f2342d;
                int i13 = bVar.f2341c;
                if (i12 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i14 = this.f2359c;
                boolean z11 = false;
                if ((i14 & 1) == 0 || i10 != i12) {
                    view = viewFindViewById;
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z12 = ((i14 & 1) != 0 && i10 == i12) | z10 | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) != 0 && i10 == i13) {
                    z11 = true;
                }
                if (z12 || z11) {
                    view.setOnClickListener(this);
                }
            }
        }

        b(p pVar, b bVar) {
            this.f2339a = -1;
            this.f2340b = false;
            this.f2341c = -1;
            this.f2342d = -1;
            this.f2343e = 0;
            this.f2344f = null;
            this.f2345g = -1;
            this.f2346h = 400;
            this.f2347i = 0.0f;
            this.f2349k = new ArrayList();
            this.f2350l = null;
            this.f2351m = new ArrayList();
            this.f2352n = 0;
            this.f2353o = false;
            this.f2354p = -1;
            this.f2355q = 0;
            this.f2356r = 0;
            this.f2348j = pVar;
            this.f2346h = pVar.f2327k;
            if (bVar != null) {
                this.f2354p = bVar.f2354p;
                this.f2343e = bVar.f2343e;
                this.f2344f = bVar.f2344f;
                this.f2345g = bVar.f2345g;
                this.f2346h = bVar.f2346h;
                this.f2349k = bVar.f2349k;
                this.f2347i = bVar.f2347i;
                this.f2355q = bVar.f2355q;
            }
        }

        private void v(p pVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                if (index == androidx.constraintlayout.widget.f.f2803ab) {
                    this.f2341c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2341c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        cVar.C(context, this.f2341c);
                        pVar.f2324h.append(this.f2341c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f2341c = pVar.M(context, this.f2341c);
                    }
                } else if (index == androidx.constraintlayout.widget.f.f2816bb) {
                    this.f2342d = typedArray.getResourceId(index, this.f2342d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f2342d);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                        cVar2.C(context, this.f2342d);
                        pVar.f2324h.append(this.f2342d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f2342d = pVar.M(context, this.f2342d);
                    }
                } else if (index == androidx.constraintlayout.widget.f.f2855eb) {
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f2345g = resourceId;
                        if (resourceId != -1) {
                            this.f2343e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = typedArray.getString(index);
                        this.f2344f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f2345g = typedArray.getResourceId(index, -1);
                                this.f2343e = -2;
                            } else {
                                this.f2343e = -1;
                            }
                        }
                    } else {
                        this.f2343e = typedArray.getInteger(index, this.f2343e);
                    }
                } else if (index == androidx.constraintlayout.widget.f.f2829cb) {
                    int i12 = typedArray.getInt(index, this.f2346h);
                    this.f2346h = i12;
                    if (i12 < 8) {
                        this.f2346h = 8;
                    }
                } else if (index == androidx.constraintlayout.widget.f.f2881gb) {
                    this.f2347i = typedArray.getFloat(index, this.f2347i);
                } else if (index == androidx.constraintlayout.widget.f.Za) {
                    this.f2352n = typedArray.getInteger(index, this.f2352n);
                } else if (index == androidx.constraintlayout.widget.f.Ya) {
                    this.f2339a = typedArray.getResourceId(index, this.f2339a);
                } else if (index == androidx.constraintlayout.widget.f.f2894hb) {
                    this.f2353o = typedArray.getBoolean(index, this.f2353o);
                } else if (index == androidx.constraintlayout.widget.f.f2868fb) {
                    this.f2354p = typedArray.getInteger(index, -1);
                } else if (index == androidx.constraintlayout.widget.f.f2842db) {
                    this.f2355q = typedArray.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.f.f2907ib) {
                    this.f2356r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f2342d == -1) {
                this.f2340b = true;
            }
        }

        private void w(p pVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.f.Xa);
            v(pVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int A() {
            return this.f2342d;
        }

        public q B() {
            return this.f2350l;
        }

        public boolean C() {
            return !this.f2353o;
        }

        public boolean D(int i10) {
            return (i10 & this.f2356r) != 0;
        }

        public void E(int i10) {
            this.f2346h = Math.max(i10, 8);
        }

        public void F(int i10, String str, int i11) {
            this.f2343e = i10;
            this.f2344f = str;
            this.f2345g = i11;
        }

        public void G(int i10) {
            q qVarB = B();
            if (qVarB != null) {
                qVarB.y(i10);
            }
        }

        public void H(int i10) {
            this.f2354p = i10;
        }

        public void t(g gVar) {
            this.f2349k.add(gVar);
        }

        public void u(Context context, XmlPullParser xmlPullParser) {
            this.f2351m.add(new a(context, this, xmlPullParser));
        }

        public int x() {
            return this.f2352n;
        }

        public int y() {
            return this.f2341c;
        }

        public int z() {
            return this.f2355q;
        }

        public b(int i10, p pVar, int i11, int i12) {
            this.f2339a = -1;
            this.f2340b = false;
            this.f2341c = -1;
            this.f2342d = -1;
            this.f2343e = 0;
            this.f2344f = null;
            this.f2345g = -1;
            this.f2346h = 400;
            this.f2347i = 0.0f;
            this.f2349k = new ArrayList();
            this.f2350l = null;
            this.f2351m = new ArrayList();
            this.f2352n = 0;
            this.f2353o = false;
            this.f2354p = -1;
            this.f2355q = 0;
            this.f2356r = 0;
            this.f2339a = i10;
            this.f2348j = pVar;
            this.f2342d = i11;
            this.f2341c = i12;
            this.f2346h = pVar.f2327k;
            this.f2355q = pVar.f2328l;
        }

        b(p pVar, Context context, XmlPullParser xmlPullParser) {
            this.f2339a = -1;
            this.f2340b = false;
            this.f2341c = -1;
            this.f2342d = -1;
            this.f2343e = 0;
            this.f2344f = null;
            this.f2345g = -1;
            this.f2346h = 400;
            this.f2347i = 0.0f;
            this.f2349k = new ArrayList();
            this.f2350l = null;
            this.f2351m = new ArrayList();
            this.f2352n = 0;
            this.f2353o = false;
            this.f2354p = -1;
            this.f2355q = 0;
            this.f2356r = 0;
            this.f2346h = pVar.f2327k;
            this.f2355q = pVar.f2328l;
            this.f2348j = pVar;
            w(pVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
