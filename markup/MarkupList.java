package markup;

import java.util.List;

abstract class MarkupList extends FramingHtml implements MarkdownConvertible, HtmlConvertible {
    protected final List<MarkupElement> elements;
    protected MarkupList(List<MarkupElement> elements) {
        this.elements = elements;
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        for (MarkdownConvertible element : elements) {
            element.toMarkdown(stringBuilder);
        }
    }

    @Override
    protected void putHtmlContent(StringBuilder stringBuilder) {
        for (HtmlConvertible element : elements) {
            element.toHtml(stringBuilder);
        }
    }
}
