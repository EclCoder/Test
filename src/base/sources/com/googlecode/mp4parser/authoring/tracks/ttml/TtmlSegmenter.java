package com.googlecode.mp4parser.authoring.tracks.ttml;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TtmlSegmenter {
    public static void changeTime(Node node, String str, long j10) {
        if (node.getAttributes() == null || node.getAttributes().getNamedItem(str) == null) {
            return;
        }
        String nodeValue = node.getAttributes().getNamedItem(str).getNodeValue();
        long time = TtmlHelpers.toTime(nodeValue) + j10;
        node.getAttributes().getNamedItem(str).setNodeValue(TtmlHelpers.toTimeExpression(time, nodeValue.contains(".") ? -1 : ((int) (time - ((time / 1000) * 1000))) / 44));
    }

    public static Document normalizeTimes(Document document) {
        XPath xPathNewXPath = XPathFactory.newInstance().newXPath();
        xPathNewXPath.setNamespaceContext(TtmlHelpers.NAMESPACE_CONTEXT);
        NodeList nodeList = (NodeList) xPathNewXPath.compile("//*[name()='p']").evaluate(document, XPathConstants.NODESET);
        for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
            pushDown(nodeList.item(i10));
        }
        for (int i11 = 0; i11 < nodeList.getLength(); i11++) {
            Node nodeItem = nodeList.item(i11);
            removeAfterPushDown(nodeItem, "begin");
            removeAfterPushDown(nodeItem, TtmlNode.END);
        }
        return document;
    }

    private static void pushDown(Node node) {
        long time = 0;
        Node parentNode = node;
        while (true) {
            parentNode = parentNode.getParentNode();
            if (parentNode == null) {
                break;
            } else if (parentNode.getAttributes() != null && parentNode.getAttributes().getNamedItem("begin") != null) {
                time += TtmlHelpers.toTime(parentNode.getAttributes().getNamedItem("begin").getNodeValue());
            }
        }
        if (node.getAttributes() != null && node.getAttributes().getNamedItem("begin") != null) {
            node.getAttributes().getNamedItem("begin").setNodeValue(TtmlHelpers.toTimeExpression(TtmlHelpers.toTime(node.getAttributes().getNamedItem("begin").getNodeValue()) + time));
        }
        if (node.getAttributes() == null || node.getAttributes().getNamedItem(TtmlNode.END) == null) {
            return;
        }
        node.getAttributes().getNamedItem(TtmlNode.END).setNodeValue(TtmlHelpers.toTimeExpression(time + TtmlHelpers.toTime(node.getAttributes().getNamedItem(TtmlNode.END).getNodeValue())));
    }

    private static void removeAfterPushDown(Node node, String str) {
        while (true) {
            node = node.getParentNode();
            if (node == null) {
                return;
            }
            if (node.getAttributes() != null && node.getAttributes().getNamedItem(str) != null) {
                node.getAttributes().removeNamedItem(str);
            }
        }
    }

    public static List<Document> split(Document document, int i10) throws XPathExpressionException {
        int i11 = i10 * 1000;
        XPath xPathNewXPath = XPathFactory.newInstance().newXPath();
        XPathExpression xPathExpressionCompile = xPathNewXPath.compile("//*[name()='p']");
        ArrayList arrayList = new ArrayList();
        while (true) {
            long size = arrayList.size() * i11;
            long size2 = (arrayList.size() + 1) * i11;
            Document document2 = (Document) document.cloneNode(true);
            NodeList nodeList = (NodeList) xPathExpressionCompile.evaluate(document2, XPathConstants.NODESET);
            int i12 = 0;
            boolean z10 = false;
            while (i12 < nodeList.getLength()) {
                int i13 = i11;
                Node nodeItem = nodeList.item(i12);
                long startTime = TtmlHelpers.getStartTime(nodeItem);
                long endTime = TtmlHelpers.getEndTime(nodeItem);
                if (startTime < size && endTime > size) {
                    changeTime(nodeItem, "begin", size - startTime);
                    startTime = size;
                }
                if (startTime >= size && startTime < size2 && endTime > size2) {
                    changeTime(nodeItem, TtmlNode.END, size2 - endTime);
                    startTime = size;
                    endTime = size2;
                }
                if (startTime > size2) {
                    z10 = true;
                }
                if (startTime < size || endTime > size2) {
                    nodeItem.getParentNode().removeChild(nodeItem);
                } else {
                    long j10 = -size;
                    changeTime(nodeItem, "begin", j10);
                    changeTime(nodeItem, TtmlNode.END, j10);
                }
                i12++;
                xPathNewXPath = xPathNewXPath;
                i11 = i13;
                xPathExpressionCompile = xPathExpressionCompile;
            }
            trimWhitespace(document2);
            Element element = (Element) xPathNewXPath.compile("/*[name()='tt']/*[name()='body'][1]").evaluate(document2, XPathConstants.NODE);
            String attribute = element.getAttribute("begin");
            String attribute2 = element.getAttribute(TtmlNode.END);
            int i14 = i11;
            if (attribute == null || "".equals(attribute)) {
                element.setAttribute("begin", TtmlHelpers.toTimeExpression(size));
            } else {
                changeTime(element, "begin", size);
            }
            if (attribute2 == null || "".equals(attribute2)) {
                element.setAttribute(TtmlNode.END, TtmlHelpers.toTimeExpression(size2));
            } else {
                changeTime(element, TtmlNode.END, size2);
            }
            arrayList.add(document2);
            if (!z10) {
                return arrayList;
            }
            i11 = i14;
        }
    }

    public static void trimWhitespace(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 3) {
                nodeItem.setTextContent(nodeItem.getTextContent().trim());
            }
            trimWhitespace(nodeItem);
        }
    }
}
