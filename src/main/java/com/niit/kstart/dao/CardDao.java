package com.niit.kstart.dao;

import com.niit.kstart.bean.Card;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 99550 on 2018/9/10.
 */
@Configuration
@Data
public class CardDao {

    public List<Card> getCardList(){
        List<Card> cardList=  new ArrayList<>();
        Card[] cards= {
                new Card("","Tp","别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。","https://cdn.sspai.com/2018/09/07/7453f4472eb69423dd8ca3495f63e6c5.png?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220",15,5),
                new Card("","化学心情下2","工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？","https://cdn.sspai.com/article/0e1c925b-a32f-f056-d7d1-861f67226eca.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220",15,5),
                new Card("","PRs","告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。","https://cdn.sspai.com/2018/09/02/62fada3d59d63604d7f90a91593d03f5.png?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220",15,5),
                new Card("","das","Chrome 在 10 周年之际发布了新版，除了好看还更安全","Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。","https://cdn.sspai.com/article/6adffdd2-2a2c-d67a-bd3c-a27e7268cd95.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220",15,5),
                new Card("","htr","他们做了这款 Kindle 标注管理工具，想为你带来更多读书的价值：专访 Knotes | 幕后","Knotes 由在美国工作的国人贺乙钊和鲁周行共同打造，前者负责软件开发，后者负责产品设计。本期幕后我们就请到了 Knotes 团队的 2 位，一起聊了聊 Knotes 的计划以及他们对美国科技行业和读书这件事的看法。","https://cdn.sspai.com/article/e0ec4294-bbc4-fa76-39a8-4b12164a63c0.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220",15,5),
                new Card("","dmm","除了课本，你还可以在这些 App 中「涨姿势」","正值开学季，我为你们收集了一些应用，希望能让你无论在校园内外，都能再体验一次知识的趣味。","https://cdn.sspai.com/article/daaa7236-fc24-cd1a-d3b0-308d8428898d.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220",15,5),
        };
        cardList= Arrays.asList(cards);
        return cardList;
    }

}
