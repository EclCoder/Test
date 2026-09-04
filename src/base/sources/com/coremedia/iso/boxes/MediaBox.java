package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MediaBox extends AbstractContainerBox {
    public static final String TYPE = "mdia";

    public MediaBox() {
        super(TYPE);
    }

    public HandlerBox getHandlerBox() {
        for (Box box : getBoxes()) {
            if (box instanceof HandlerBox) {
                return (HandlerBox) box;
            }
        }
        return null;
    }

    public MediaHeaderBox getMediaHeaderBox() {
        for (Box box : getBoxes()) {
            if (box instanceof MediaHeaderBox) {
                return (MediaHeaderBox) box;
            }
        }
        return null;
    }

    public MediaInformationBox getMediaInformationBox() {
        for (Box box : getBoxes()) {
            if (box instanceof MediaInformationBox) {
                return (MediaInformationBox) box;
            }
        }
        return null;
    }
}
