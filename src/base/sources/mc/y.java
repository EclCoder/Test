package mc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f45757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f45758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[][] f45759c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a[] f45760d = new a[10];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f45761a;

        a(b bVar) {
            this.f45761a = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f45762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f45763b;

        b(c cVar, float f10) {
            this.f45762a = cVar;
            this.f45763b = f10;
        }

        public int a(int i10) {
            c cVar = this.f45762a;
            if (cVar == c.PERCENT) {
                return (int) (this.f45763b * i10);
            }
            if (cVar == c.PIXELS) {
                return (int) this.f45763b;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        PERCENT,
        PIXELS
    }

    private void a(int[] iArr, a aVar) {
        int i10 = this.f45757a;
        if (i10 == 0 || iArr.length == 0) {
            this.f45758b = aVar;
        }
        if (i10 >= this.f45759c.length) {
            f(i10, i10 + 10);
        }
        int[][] iArr2 = this.f45759c;
        int i11 = this.f45757a;
        iArr2[i11] = iArr;
        this.f45760d[i11] = aVar;
        this.f45757a = i11 + 1;
    }

    public static y b(Context context, TypedArray typedArray, int i10) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                y yVar = new y();
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
                    yVar.h(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return yVar;
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
            return null;
        }
    }

    private b d(TypedArray typedArray, int i10, b bVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new b(c.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new b(c.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    private void f(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f45759c, 0, iArr, 0, i10);
        this.f45759c = iArr;
        a[] aVarArr = new a[i11];
        System.arraycopy(this.f45760d, 0, aVarArr, 0, i10);
        this.f45760d = aVarArr;
    }

    private int g(int[] iArr) {
        int[][] iArr2 = this.f45759c;
        for (int i10 = 0; i10 < this.f45757a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    private void h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, sb.m.Lb) : theme.obtainStyledAttributes(attributeSet, sb.m.Lb, 0, 0);
                b bVarD = d(typedArrayObtainAttributes, sb.m.Mb, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != sb.c.f51647z0) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), new a(bVarD));
            }
        }
    }

    public int c(int i10) {
        float fMax;
        int i11 = -i10;
        for (int i12 = 0; i12 < this.f45757a; i12++) {
            b bVar = this.f45760d[i12].f45761a;
            c cVar = bVar.f45762a;
            if (cVar == c.PIXELS) {
                fMax = Math.max(i11, bVar.f45763b);
            } else {
                if (cVar == c.PERCENT) {
                    fMax = Math.max(i11, i10 * bVar.f45763b);
                }
            }
            i11 = (int) fMax;
        }
        return i11;
    }

    public a e(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return iG < 0 ? this.f45758b : this.f45760d[iG];
    }
}
