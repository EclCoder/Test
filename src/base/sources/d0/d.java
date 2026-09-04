package d0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f36049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f36050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36051c;

    private d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f36049a = shader;
        this.f36050b = colorStateList;
        this.f36051c = i10;
    }

    private static d a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
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
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i10) {
        return new d(null, null, i10);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public int e() {
        return this.f36051c;
    }

    public Shader f() {
        return this.f36049a;
    }

    public boolean h() {
        return this.f36049a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f36049a == null && (colorStateList = this.f36050b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f36050b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f36051c) {
            return false;
        }
        this.f36051c = colorForState;
        return true;
    }

    public void k(int i10) {
        this.f36051c = i10;
    }

    public boolean l() {
        return h() || this.f36051c != 0;
    }
}
