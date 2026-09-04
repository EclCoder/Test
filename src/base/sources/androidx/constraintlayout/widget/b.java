package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f2663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f2664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2665c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2666d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray f2667e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray f2668f = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f2670b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f2672d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f2671c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.Ea);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.Fa) {
                    this.f2669a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2669a);
                } else if (index == f.Ga) {
                    this.f2671c = typedArrayObtainStyledAttributes.getResourceId(index, this.f2671c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2671c);
                    context.getResources().getResourceName(this.f2671c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f2672d = cVar;
                        cVar.n(context, this.f2671c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(C0024b c0024b) {
            this.f2670b.add(c0024b);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f2670b.size(); i10++) {
                if (((C0024b) this.f2670b.get(i10)).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0024b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f2673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f2674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f2675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f2676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        c f2678f;

        C0024b(Context context, XmlPullParser xmlPullParser) {
            this.f2673a = Float.NaN;
            this.f2674b = Float.NaN;
            this.f2675c = Float.NaN;
            this.f2676d = Float.NaN;
            this.f2677e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f2920jb);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f2933kb) {
                    this.f2677e = typedArrayObtainStyledAttributes.getResourceId(index, this.f2677e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2677e);
                    context.getResources().getResourceName(this.f2677e);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        c cVar = new c();
                        this.f2678f = cVar;
                        cVar.n(context, this.f2677e);
                    }
                } else if (index == f.f2946lb) {
                    this.f2676d = typedArrayObtainStyledAttributes.getDimension(index, this.f2676d);
                } else if (index == f.f2959mb) {
                    this.f2674b = typedArrayObtainStyledAttributes.getDimension(index, this.f2674b);
                } else if (index == f.f2972nb) {
                    this.f2675c = typedArrayObtainStyledAttributes.getDimension(index, this.f2675c);
                } else if (index == f.f2985ob) {
                    this.f2673a = typedArrayObtainStyledAttributes.getDimension(index, this.f2673a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f2673a) && f10 < this.f2673a) {
                return false;
            }
            if (!Float.isNaN(this.f2674b) && f11 < this.f2674b) {
                return false;
            }
            if (Float.isNaN(this.f2675c) || f10 <= this.f2675c) {
                return Float.isNaN(this.f2676d) || f11 <= this.f2676d;
            }
            return false;
        }
    }

    b(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f2663a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                this.f2667e.put(aVar2.f2669a, aVar2);
                                aVar = aVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C0024b c0024b = new C0024b(context, xml);
                                if (aVar != null) {
                                    aVar.a(c0024b);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e11);
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.D(context, xmlPullParser);
                this.f2668f.put(identifier, cVar);
                return;
            }
        }
    }

    public void d(int i10, float f10, float f11) {
        int iB;
        int i11 = this.f2665c;
        if (i11 == i10) {
            a aVar = i10 == -1 ? (a) this.f2667e.valueAt(0) : (a) this.f2667e.get(i11);
            int i12 = this.f2666d;
            if ((i12 == -1 || !((C0024b) aVar.f2670b.get(i12)).a(f10, f11)) && this.f2666d != (iB = aVar.b(f10, f11))) {
                c cVar = iB == -1 ? this.f2664b : ((C0024b) aVar.f2670b.get(iB)).f2678f;
                if (iB != -1) {
                    int i13 = ((C0024b) aVar.f2670b.get(iB)).f2677e;
                }
                if (cVar == null) {
                    return;
                }
                this.f2666d = iB;
                cVar.i(this.f2663a);
                return;
            }
            return;
        }
        this.f2665c = i10;
        a aVar2 = (a) this.f2667e.get(i10);
        int iB2 = aVar2.b(f10, f11);
        c cVar2 = iB2 == -1 ? aVar2.f2672d : ((C0024b) aVar2.f2670b.get(iB2)).f2678f;
        if (iB2 != -1) {
            int i14 = ((C0024b) aVar2.f2670b.get(iB2)).f2677e;
        }
        if (cVar2 != null) {
            this.f2666d = iB2;
            cVar2.i(this.f2663a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }

    public void c(d dVar) {
    }
}
