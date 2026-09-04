package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static HashMap f2188b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f2189a = new HashMap();

    static {
        HashMap map = new HashMap();
        f2188b = map;
        try {
            map.put("KeyAttribute", e.class.getConstructor(null));
            f2188b.put("KeyPosition", h.class.getConstructor(null));
            f2188b.put("KeyCycle", f.class.getConstructor(null));
            f2188b.put("KeyTimeCycle", j.class.getConstructor(null));
            f2188b.put("KeyTrigger", k.class.getConstructor(null));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public g() {
    }

    public void a(m mVar) {
        ArrayList arrayList = (ArrayList) this.f2189a.get(-1);
        if (arrayList != null) {
            mVar.b(arrayList);
        }
    }

    public void b(m mVar) {
        ArrayList arrayList = (ArrayList) this.f2189a.get(Integer.valueOf(mVar.f2272c));
        if (arrayList != null) {
            mVar.b(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f2189a.get(-1);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                d dVar = (d) obj;
                if (dVar.f(((ConstraintLayout.b) mVar.f2271b.getLayoutParams()).f2579c0)) {
                    mVar.a(dVar);
                }
            }
        }
    }

    public void c(d dVar) {
        if (!this.f2189a.containsKey(Integer.valueOf(dVar.f2145b))) {
            this.f2189a.put(Integer.valueOf(dVar.f2145b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) this.f2189a.get(Integer.valueOf(dVar.f2145b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public ArrayList d(int i10) {
        return (ArrayList) this.f2189a.get(Integer.valueOf(i10));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public g(Context context, XmlPullParser xmlPullParser) {
        HashMap map;
        HashMap map2;
        d jVar;
        try {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f2188b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    jVar = new j();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    jVar = new e();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    jVar = new f();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    jVar = new h();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    jVar = new k();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                    }
                    if (name.equalsIgnoreCase(mDXVAtwcaFMHJ.OnlEQdkao)) {
                        if (dVar != null && (map2 = dVar.f2148e) != null) {
                            androidx.constraintlayout.widget.a.i(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar != null && (map = dVar.f2148e) != null) {
                        androidx.constraintlayout.widget.a.i(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("KeyFrames", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("KeyFrames", "Error parsing XML resource", e11);
        }
    }
}
