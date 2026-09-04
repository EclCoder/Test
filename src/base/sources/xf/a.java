package xf;

import android.content.res.XmlResourceParser;
import bm.r;
import com.hecorat.screenrecorder.free.models.BitRate;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import com.hecorat.screenrecorder.free.models.FrameRate;
import com.hecorat.screenrecorder.free.models.Resolution;
import em.k0;
import java.io.IOException;
import java.util.ArrayList;
import kl.f;
import kotlin.jvm.internal.s;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k0 ioDispatcher) {
        super(ioDispatcher);
        s.h(ioDispatcher, "ioDispatcher");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xf.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(XmlResourceParser xmlResourceParser, f fVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlResourceParser.getEventType();
        float fC = nh.b.c().c();
        String attributeValue = "";
        String str = "";
        int iFloor = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        String str2 = str;
        while (eventType != 1) {
            String name = xmlResourceParser.getName();
            if (eventType != 2) {
                if (eventType == 3 && name.equals("Param")) {
                    arrayList.add(new EncodeParam(new Resolution(attributeValue, iFloor, i10), new BitRate(str2, i11), new FrameRate(str, i12)));
                }
            } else if (name.equals("Resolution")) {
                attributeValue = xmlResourceParser.getAttributeValue(0);
            } else if (name.equals("Height")) {
                String strNextText = xmlResourceParser.nextText();
                s.g(strNextText, "nextText(...)");
                int i13 = Integer.parseInt(r.V0(strNextText).toString());
                iFloor = (int) Math.floor(i13 * fC);
                if (iFloor % 2 == 1) {
                    iFloor++;
                }
                i10 = i13;
            } else if (name.equals("BitRate")) {
                String attributeValue2 = xmlResourceParser.getAttributeValue(0);
                String strNextText2 = xmlResourceParser.nextText();
                s.g(strNextText2, "nextText(...)");
                i11 = Integer.parseInt(r.V0(strNextText2).toString());
                str2 = attributeValue2;
            } else if (name.equals("FrameRate")) {
                String attributeValue3 = xmlResourceParser.getAttributeValue(0);
                String strNextText3 = xmlResourceParser.nextText();
                s.g(strNextText3, "nextText(...)");
                i12 = Integer.parseInt(r.V0(strNextText3).toString());
                str = attributeValue3;
            }
            eventType = xmlResourceParser.next();
        }
        return arrayList;
    }
}
