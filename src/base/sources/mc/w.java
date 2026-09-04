package mc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f45737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f45738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[][] f45739c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d[] f45740d = new d[10];

    private void a(int[] iArr, d dVar) {
        int i10 = this.f45737a;
        if (i10 == 0 || iArr.length == 0) {
            this.f45738b = dVar;
        }
        if (i10 >= this.f45739c.length) {
            f(i10, i10 + 10);
        }
        int[][] iArr2 = this.f45739c;
        int i11 = this.f45737a;
        iArr2[i11] = iArr;
        this.f45740d[i11] = dVar;
        this.f45737a = i11 + 1;
    }

    public static w b(Context context, TypedArray typedArray, int i10, d dVar) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return c(p.v(typedArray, i10, dVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return c(p.v(typedArray, i10, dVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                w wVar = new w();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    wVar.i(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return wVar;
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
            return c(dVar);
        }
    }

    public static w c(d dVar) {
        w wVar = new w();
        wVar.a(StateSet.WILD_CARD, dVar);
        return wVar;
    }

    private void f(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f45739c, 0, iArr, 0, i10);
        this.f45739c = iArr;
        d[] dVarArr = new d[i11];
        System.arraycopy(this.f45740d, 0, dVarArr, 0, i10);
        this.f45740d = dVarArr;
    }

    private int g(int[] iArr) {
        int[][] iArr2 = this.f45739c;
        for (int i10 = 0; i10 < this.f45737a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    private void i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, sb.m.f52018ia) : theme.obtainStyledAttributes(attributeSet, sb.m.f52018ia, 0, 0);
                d dVarV = p.v(typedArrayObtainAttributes, sb.m.f52108oa, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != sb.c.f51624o) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), dVarV);
            }
        }
    }

    public d d(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return iG < 0 ? this.f45738b : this.f45740d[iG];
    }

    public d e() {
        return this.f45738b;
    }

    public boolean h() {
        return this.f45737a > 1;
    }
}
