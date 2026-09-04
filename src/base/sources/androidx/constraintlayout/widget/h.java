package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
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
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3131a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3132b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3133c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SparseArray f3134d = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f3136b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3138d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f3137c = -1;
            this.f3138d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.Ea);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.Fa) {
                    this.f3135a = typedArrayObtainStyledAttributes.getResourceId(index, this.f3135a);
                } else if (index == f.Ga) {
                    this.f3137c = typedArrayObtainStyledAttributes.getResourceId(index, this.f3137c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3137c);
                    context.getResources().getResourceName(this.f3137c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f3138d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f3136b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f3136b.size(); i10++) {
                if (((b) this.f3136b.get(i10)).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f3139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f3142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3144f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f3139a = Float.NaN;
            this.f3140b = Float.NaN;
            this.f3141c = Float.NaN;
            this.f3142d = Float.NaN;
            this.f3143e = -1;
            this.f3144f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f2920jb);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f2933kb) {
                    this.f3143e = typedArrayObtainStyledAttributes.getResourceId(index, this.f3143e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3143e);
                    context.getResources().getResourceName(this.f3143e);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f3144f = true;
                    }
                } else if (index == f.f2946lb) {
                    this.f3142d = typedArrayObtainStyledAttributes.getDimension(index, this.f3142d);
                } else if (index == f.f2959mb) {
                    this.f3140b = typedArrayObtainStyledAttributes.getDimension(index, this.f3140b);
                } else if (index == f.f2972nb) {
                    this.f3141c = typedArrayObtainStyledAttributes.getDimension(index, this.f3141c);
                } else if (index == f.f2985ob) {
                    this.f3139a = typedArrayObtainStyledAttributes.getDimension(index, this.f3139a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f3139a) && f10 < this.f3139a) {
                return false;
            }
            if (!Float.isNaN(this.f3140b) && f11 < this.f3140b) {
                return false;
            }
            if (Float.isNaN(this.f3141c) || f10 <= this.f3141c) {
                return Float.isNaN(this.f3142d) || f11 <= this.f3142d;
            }
            return false;
        }
    }

    public h(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.Ha);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == f.Ia) {
                this.f3131a = typedArrayObtainStyledAttributes.getResourceId(index, this.f3131a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xmlPullParser);
                                this.f3134d.put(aVar.f3135a, aVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        }
    }

    public int a(int i10, int i11, float f10, float f11) {
        a aVar = (a) this.f3134d.get(i11);
        if (aVar == null) {
            return i11;
        }
        int i12 = 0;
        if (f10 != -1.0f && f11 != -1.0f) {
            ArrayList arrayList = aVar.f3136b;
            int size = arrayList.size();
            b bVar = null;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                b bVar2 = (b) obj;
                if (bVar2.a(f10, f11)) {
                    if (i10 != bVar2.f3143e) {
                        bVar = bVar2;
                    }
                }
            }
            return bVar != null ? bVar.f3143e : aVar.f3137c;
        }
        if (aVar.f3137c != i10) {
            ArrayList arrayList2 = aVar.f3136b;
            int size2 = arrayList2.size();
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                if (i10 == ((b) obj2).f3143e) {
                }
            }
            return aVar.f3137c;
        }
        return i10;
    }

    public int c(int i10, int i11, int i12) {
        return d(-1, i10, i11, i12);
    }

    public int d(int i10, int i11, float f10, float f11) {
        int iB;
        if (i10 != i11) {
            a aVar = (a) this.f3134d.get(i11);
            if (aVar == null) {
                return -1;
            }
            int iB2 = aVar.b(f10, f11);
            return iB2 == -1 ? aVar.f3137c : ((b) aVar.f3136b.get(iB2)).f3143e;
        }
        a aVar2 = i11 == -1 ? (a) this.f3134d.valueAt(0) : (a) this.f3134d.get(this.f3132b);
        if (aVar2 == null) {
            return -1;
        }
        if ((this.f3133c == -1 || !((b) aVar2.f3136b.get(i10)).a(f10, f11)) && i10 != (iB = aVar2.b(f10, f11))) {
            return iB == -1 ? aVar2.f3137c : ((b) aVar2.f3136b.get(iB)).f3143e;
        }
        return i10;
    }
}
