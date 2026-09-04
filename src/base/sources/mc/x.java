package mc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class x implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f45741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p f45742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[][] f45743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final p[] f45744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final w f45745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final w f45746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final w f45747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final w f45748h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f45749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f45750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[][] f45751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p[] f45752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private w f45753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private w f45754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private w f45755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w f45756h;

        private void k(int i10, int i11) {
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f45751c, 0, iArr, 0, i10);
            this.f45751c = iArr;
            p[] pVarArr = new p[i11];
            System.arraycopy(this.f45752d, 0, pVarArr, 0, i10);
            this.f45752d = pVarArr;
        }

        private void l() {
            this.f45750b = new p();
            this.f45751c = new int[10][];
            this.f45752d = new p[10];
        }

        public b i(int[] iArr, p pVar) {
            int i10 = this.f45749a;
            if (i10 == 0 || iArr.length == 0) {
                this.f45750b = pVar;
            }
            if (i10 >= this.f45751c.length) {
                k(i10, i10 + 10);
            }
            int[][] iArr2 = this.f45751c;
            int i11 = this.f45749a;
            iArr2[i11] = iArr;
            this.f45752d[i11] = pVar;
            this.f45749a = i11 + 1;
            return this;
        }

        public x j() {
            if (this.f45749a == 0) {
                return null;
            }
            return new x(this);
        }

        public b m(w wVar, int i10) {
            if (p.p(i10, 1)) {
                this.f45753e = wVar;
            }
            if (p.p(i10, 2)) {
                this.f45754f = wVar;
            }
            if (p.p(i10, 4)) {
                this.f45755g = wVar;
            }
            if (p.p(i10, 8)) {
                this.f45756h = wVar;
            }
            return this;
        }

        public b(x xVar) {
            int i10 = xVar.f45741a;
            this.f45749a = i10;
            this.f45750b = xVar.f45742b;
            int[][] iArr = xVar.f45743c;
            int[][] iArr2 = new int[iArr.length][];
            this.f45751c = iArr2;
            this.f45752d = new p[xVar.f45744d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(xVar.f45744d, 0, this.f45752d, 0, this.f45749a);
            this.f45753e = xVar.f45745e;
            this.f45754f = xVar.f45746f;
            this.f45755g = xVar.f45747g;
            this.f45756h = xVar.f45748h;
        }

        public b(p pVar) {
            l();
            i(StateSet.WILD_CARD, pVar);
        }

        private b(Context context, int i10) {
            int next;
            l();
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            x.k(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
                } catch (Throwable th2) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                l();
            }
        }
    }

    public static x h(Context context, TypedArray typedArray, int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).j();
        }
        return null;
    }

    private int j(int[] iArr) {
        int[][] iArr2 = this.f45743c;
        for (int i10 = 0; i10 < this.f45741a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, sb.m.S6) : theme.obtainStyledAttributes(attributeSet, sb.m.S6, 0, 0);
                p pVarM = p.h(context, typedArrayObtainAttributes.getResourceId(sb.m.T6, 0), typedArrayObtainAttributes.getResourceId(sb.m.U6, 0)).m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != sb.c.f51605e0 && attributeNameResource != sb.c.f51607f0) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                bVar.i(StateSet.trimStateSet(iArr, i10), pVarM);
            }
        }
    }

    public static int l(int i10) {
        int i11 = i10 & 5;
        return ((i10 & 10) >> 1) | (i11 << 1);
    }

    @Override // mc.o
    public p a(float f10) {
        return e().a(f10);
    }

    @Override // mc.o
    public p b(int[] iArr) {
        int iJ = j(iArr);
        if (iJ < 0) {
            iJ = j(StateSet.WILD_CARD);
        }
        if (this.f45745e == null && this.f45746f == null && this.f45747g == null && this.f45748h == null) {
            return this.f45744d[iJ];
        }
        p.b bVarF = this.f45744d[iJ].F();
        w wVar = this.f45745e;
        if (wVar != null) {
            bVarF.F(wVar.d(iArr));
        }
        w wVar2 = this.f45746f;
        if (wVar2 != null) {
            bVarF.J(wVar2.d(iArr));
        }
        w wVar3 = this.f45747g;
        if (wVar3 != null) {
            bVarF.w(wVar3.d(iArr));
        }
        w wVar4 = this.f45748h;
        if (wVar4 != null) {
            bVarF.A(wVar4.d(iArr));
        }
        return bVarF.m();
    }

    @Override // mc.o
    public p c(d dVar) {
        return e().c(dVar);
    }

    @Override // mc.o
    public p[] d() {
        return this.f45744d;
    }

    @Override // mc.o
    public p e() {
        return i(true);
    }

    @Override // mc.o
    public boolean f() {
        w wVar;
        w wVar2;
        w wVar3;
        w wVar4;
        return this.f45741a > 1 || ((wVar = this.f45745e) != null && wVar.h()) || (((wVar2 = this.f45746f) != null && wVar2.h()) || (((wVar3 = this.f45747g) != null && wVar3.h()) || ((wVar4 = this.f45748h) != null && wVar4.h())));
    }

    public p i(boolean z10) {
        if (!z10 || (this.f45745e == null && this.f45746f == null && this.f45747g == null && this.f45748h == null)) {
            return this.f45742b;
        }
        p.b bVarF = this.f45742b.F();
        w wVar = this.f45745e;
        if (wVar != null) {
            bVarF.F(wVar.e());
        }
        w wVar2 = this.f45746f;
        if (wVar2 != null) {
            bVarF.J(wVar2.e());
        }
        w wVar3 = this.f45747g;
        if (wVar3 != null) {
            bVarF.w(wVar3.e());
        }
        w wVar4 = this.f45748h;
        if (wVar4 != null) {
            bVarF.A(wVar4.e());
        }
        return bVarF.m();
    }

    public b m() {
        return new b(this);
    }

    private x(b bVar) {
        this.f45741a = bVar.f45749a;
        this.f45742b = bVar.f45750b;
        this.f45743c = bVar.f45751c;
        this.f45744d = bVar.f45752d;
        this.f45745e = bVar.f45753e;
        this.f45746f = bVar.f45754f;
        this.f45747g = bVar.f45755g;
        this.f45748h = bVar.f45756h;
    }
}
