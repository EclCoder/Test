package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class[] f6395e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f6396f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f6398b = new Object[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f6399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f6400d;

    public i(Context context, j jVar) {
        this.f6397a = context;
        f(jVar);
    }

    private Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) f6396f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f6397a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f6395e);
                    constructor.setAccessible(true);
                    f6396f.put(str, constructor);
                } catch (Exception e12) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e12);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e13) {
                throw e13;
            }
        }
        Object[] objArr = this.f6398b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? g(str, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    private void f(j jVar) {
        this.f6399c = jVar;
        j(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    private PreferenceGroup h(PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.Q(this.f6399c);
        return preferenceGroup2;
    }

    private void i(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.v0(Intent.parseIntent(c().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e10);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    c().getResources().parseBundleExtra("extra", attributeSet, preference.k());
                    try {
                        k(xmlPullParser);
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e11);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    ((PreferenceGroup) preference).O0(preferenceB);
                    i(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }

    private static void k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    public Context c() {
        return this.f6397a;
    }

    public Preference d(int i10, PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = c().getResources().getXml(i10);
        try {
            return e(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    public Preference e(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup preferenceGroupH;
        synchronized (this.f6398b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f6398b[0] = this.f6397a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e10) {
                    throw e10;
                } catch (IOException e11) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e11.getMessage());
                    inflateException.initCause(e11);
                    throw inflateException;
                } catch (XmlPullParserException e12) {
                    InflateException inflateException2 = new InflateException(e12.getMessage());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroupH = h(preferenceGroup, (PreferenceGroup) b(xmlPullParser.getName(), attributeSetAsAttributeSet));
            i(xmlPullParser, preferenceGroupH, attributeSetAsAttributeSet);
        }
        return preferenceGroupH;
    }

    protected Preference g(String str, AttributeSet attributeSet) {
        return a(str, this.f6400d, attributeSet);
    }

    public void j(String[] strArr) {
        this.f6400d = strArr;
    }
}
