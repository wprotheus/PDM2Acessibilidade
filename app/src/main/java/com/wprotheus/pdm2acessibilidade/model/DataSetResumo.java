package com.wprotheus.pdm2acessibilidade.model;

import androidx.annotation.NonNull;

import com.wprotheus.pdm2acessibilidade.R;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataSetResumo implements Serializable {
    private static String header = "<html>\n" +
            "<head>\n" +
            "<style type=\"text/css\">\n" +
            "    body {\n" +
//                "        font-family: Serif;\n" +
            "        font-family: 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n" +
            "        font-size: 20px;\n" +
            "        text-align: justify;\n" +
            "        margin: 20px;\n" +
            "    }\n" +
            "    .content {\n" +
            "        max-width: 800px;\n" +
            "        margin: 0 auto;\n" +
            "    }\n" +
            "    ol {\n" +
            "        margin: 20px 0;\n" +
            "        padding-left: 20px;\n" +
            "    }\n" +
            "    p {\n" +
            "        margin: 10px 0;\n" +
            "    }\n" +
            "</style>\n" +
            "</head>\n" +
            "<body>\n";

    @NonNull
    @Contract(pure = true)
    public static String dezDicas() {
        return header +
                "    <div class=\"content\">\n" +
                "        <p>O vídeo <b>\"10 tips to build an app for billions of users\"</b> fornece dicas para construir um aplicativo" +
                " para o próximo bilhão de usuários em mercados emergentes.</p>\n" +
                "        <p>As 10 dicas são:</p>\n" +
                "        <ol>\n" +
                "            <li>\n" +
                "                <p><strong>Fale o idioma do seu usuário:</strong> Localize seu aplicativo e conteúdo para o idioma do seu público.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Adapte datas e horários:</strong> Internacionalize datas e horários e mostre-os de acordo " +
                "com as configurações do telefone do usuário.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Use menos palavras e mais recursos visuais:</strong> Muitos usuários em mercados emergentes " +
                "têm maior numeracia do que alfabetização. Use menos palavras e forneça pistas gráficas com suporte de áudio e voz.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Mantenha a interação simples:</strong> Evite menus de rolagem e use interfaces tocáveis e navegáveis. " +
                "Por exemplo, autocompletar e listas curadas podem ser melhores do que pesquisa e filtragem.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Projete seu aplicativo para diferentes idiomas:</strong> Permita diferentes comprimentos e " +
                "estruturas de frase. O serviço de tradução de aplicativos disponível no console do desenvolvedor pode ajudar.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Teste com falantes nativos:</strong> Certifique-se de testar tudo com falantes nativos para " +
                "garantir que seu aplicativo seja claro e fácil de usar.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Forneça o conteúdo e os recursos certos:</strong> Pesquise novos mercados cuidadosamente e " +
                "crie recursos com base em tendências e preferências locais. Por exemplo, pense em \"mobile first\" e não confie na " +
                "familiaridade com senhas de e-mail e web.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Ofereça registro baseado em número de telefone:</strong> Os telefones multi-SIM também são " +
                "populares e podem ser detectados desde o Android 5.1. Isso permite que você adapte o uso de dados do seu aplicativo pelo SIM.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Adapte-se a conexões de dados lentas e intermitentes:</strong> Muitos usuários não terão " +
                "acesso a conexões de dados confiáveis. É importante adaptar seu aplicativo para usar menos dados e, se possível, também funcionar offline.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><strong>Acomoda dispositivos de baixo custo e telas menores:</strong> Em mercados emergentes, " +
                "muitos dispositivos tendem a ter telas pequenas. Certifique-se de otimizar sua interface do usuário testando em vários " +
                "tamanhos de tela. Você também deve adaptar seu aplicativo para dispositivos de baixo custo que podem ter baixa memória, " +
                "baixo poder de processamento e baixa resolução.</p>\n" +
                "            </li>\n" +
                "        </ol>\n" +
                "        <p>O vídeo também inclui dicas sobre como otimizar seu aplicativo para menos memória de telefone e bateria mais curta, " +
                "como refletir hábitos e ciclos de compra locais e como aumentar seu público com promoção de aplicativo.</p>\n" +
                "        <p>Para mais informações sobre como construir seu aplicativo para o sucesso em mercados emergentes, " +
                "leia a lista de verificação na seção de distribuição do site do desenvolvedor Android.</p>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
    }

    @NonNull
    @Contract(pure = true)
    public static String dezDicasToSpeech() {
        return "O vídeo 10 tips to build an app for billions of users fornece dicas para construir um aplicativo\n" +
                "para o próximo bilhão de usuários em mercados emergentes.\n" +
                "As 10 dicas são:\n" +
                "1.\tFale o idioma do seu usuário: Localize seu aplicativo e conteúdo para o idioma do seu público.\n" +
                "2.\tAdapte datas e horários: Internacionalize datas e horários e mostre-os de acordo com " +
                "as configurações do telefone do usuário.\n" +
                "3.\tUse menos palavras e mais recursos visuais: Muitos usuários em mercados emergentes têm " +
                "maior numeracia do que alfabetização. Use menos palavras e forneça pistas gráficas com suporte de áudio e voz.\n" +
                "4.\tMantenha a interação simples: Evite menus de rolagem e use interfaces tocáveis e navegáveis. " +
                "Por exemplo, autocompletar e listas curadas podem ser melhores do que pesquisa e filtragem.\n" +
                "5.\tProjete seu aplicativo para diferentes idiomas: Permita diferentes comprimentos e " +
                "estruturas de frase. O serviço de tradução de aplicativos disponível no console do desenvolvedor pode ajudar.\n" +
                "6.\tTeste com falantes nativos: Certifique-se de testar tudo com falantes nativos para garantir " +
                "que seu aplicativo seja claro e fácil de usar.\n" +
                "7.\tForneça o conteúdo e os recursos certos: Pesquise novos mercados cuidadosamente e " +
                "crie recursos com base em tendências e preferências locais. Por exemplo, pense em \"mobile first\" e " +
                "não confie na familiaridade com senhas de e-mail e web.\n" +
                "8.\tOfereça registro baseado em número de telefone: Os telefones multi-SIM também são populares e " +
                "podem ser detectados desde o Android 5.1. Isso permite que você adapte o uso de dados do seu aplicativo pelo SIM.\n" +
                "9.\tAdapte-se a conexões de dados lentas e intermitentes: Muitos usuários não terão acesso a " +
                "conexões de dados confiáveis. É importante adaptar seu aplicativo para usar menos dados e, se possível, também funcionar offline.\n" +
                "10.\tAcomoda dispositivos de baixo custo e telas menores: Em mercados emergentes, muitos dispositivos " +
                "tendem a ter telas pequenas. Certifique-se de otimizar sua interface do usuário testando em vários tamanhos de tela. " +
                "Você também deve adaptar seu aplicativo para dispositivos de baixo custo que podem ter " +
                "baixa memória, baixo poder de processamento e baixa resolução.\n" +
                "O vídeo também inclui dicas sobre como otimizar seu aplicativo para menos memória de telefone e " +
                "bateria mais curta, como refletir hábitos e ciclos de compra locais e como aumentar seu público com promoção de aplicativo.\n" +
                "Para mais informações sobre como construir seu aplicativo para o sucesso em mercados emergentes, " +
                "leia a lista de verificação na seção de distribuição do site do desenvolvedor Android.";
    }

    @NonNull
    @Contract(pure = true)
    public static String a11y() {
        return header +
                "    <div class=\"content\">\n" +
                "        <p>O vídeo <b>“Accessibility 101: Getting started with assistive technology and product inclusion”</b>" +
                " é sobre como começar com acessibilidade e inclusão de produtos.</p>\n" +
                "        <p>Acessibilidade é a prática de tornar produtos, ambientes e estruturas sociais utilizáveis e " +
                "inclusivos para pessoas com deficiência. A inclusão de produtos é um processo de desenvolvimento de ponta a ponta que" +
                " considera a inclusão em muitos pontos de contato para centralizar vozes historicamente sub-representadas e " +
                "criar melhores soluções para todos.</p>\n" +
                "        <p>Aqui estão algumas das principais lições do vídeo:</p>\n" +
                "        <ol>\n" +
                "            <li>\n" +
                "                <p><b>Familiarize-se com as tecnologias assistivas:</b> Experimente usar a navegação apenas com " +
                "o teclado e um leitor de tela para entender como as pessoas com deficiência usam os produtos.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><b>Audite seu produto por meio de testes automatizados e manuais:</b> Use ferramentas como o " +
                "aplicativo Accessibility Scanner e a ferramenta de desenvolvimento Chrome Lighthouse para identificar problemas de acessibilidade.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><b>Corrija seus bugs e priorize os mais simples primeiro:</b> Consulte o WCAG " +
                "(Web Content Accessibility Guidelines) para obter orientações sobre como corrigir problemas de acessibilidade.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><b>Considere trazer a acessibilidade mais cedo no processo:</b> Ao planejar e projetar seu produto, " +
                "pense em como torná-lo acessível a todos.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><b>A inclusão de produtos não se trata apenas de acessibilidade:</b> Também se trata de representar " +
                "pessoas de todas as origens e habilidades em seu produto.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><b>A inclusão de produtos é um processo de ponta a ponta:</b> Considere a inclusão em muitos " +
                "pontos de contato, desde a ideação até o marketing.</p>\n" +
                "            </li>\n" +
                "            <li>\n" +
                "                <p><b>A inclusão de produtos é uma mentalidade e uma cultura:</b> Incentive discussões sobre inclusão e " +
                "construa produtos com usuários historicamente sub-representados.</p>\n" +
                "            </li>\n" +
                "        </ol>\n" +
                "        <p>O vídeo também inclui uma série de recursos para aprender mais sobre acessibilidade e inclusão de produtos, incluindo:</p>\n" +
                "        <ul>\n" +
                "            <li>Um link para o WCAG (Web Content Accessibility Guidelines)</li>\n" +
                "            <li>Uma série de vídeos sobre acessibilidade chamada <i>Alleycasts</i></li>\n" +
                "        </ul>\n" +
                "        <p>Espero que tenha gostado!</p>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n";
    }

    @NonNull
    @Contract(pure = true)
    public static String a11yZap() {
        return "O vídeo *“_Accessibility 101: Getting started with assistive technology and product inclusion_”* " +
                "é sobre como começar com acessibilidade e inclusão de produtos.\n" +
                "Acessibilidade é a prática de tornar produtos, ambientes e estruturas sociais utilizáveis e " +
                "inclusivos para pessoas com deficiência. A inclusão de produtos é um processo de desenvolvimento " +
                "de produtos de ponta a ponta que considera a inclusão em muitos pontos de contato para " +
                "centralizar vozes historicamente sub-representadas e criar melhores soluções para todos.\n" +
                "Aqui estão algumas das principais lições do vídeo:\n" +
                "1.\t*Familiarize-se com as tecnologias assistivas:* Experimente usar a navegação apenas " +
                "com o teclado e um leitor de tela para entender como as pessoas com deficiência usam os produtos.\n" +
                "2.\t*Audite seu produto por meio de testes automatizados e manuais:* Use ferramentas como o aplicativo " +
                "Accessibility Scanner e a ferramenta de desenvolvimento Chrome Lighthouse " +
                "para identificar problemas de acessibilidade.\n" +
                "3.\t*Corrija seus bugs e priorize os mais simples primeiro:* Consulte o WCAG " +
                "(Web Content Accessibility Guidelines) para obter orientações sobre como " +
                "corrigir problemas de acessibilidade.\n" +
                "4.\t*Considere trazer a acessibilidade mais cedo no processo:* Ao planejar e projetar seu produto, " +
                "pense em como torná-lo acessível a todos.\n" +
                "5.\t*A inclusão de produtos não se trata apenas de acessibilidade:* Também se trata de representar " +
                "pessoas de todas as origens e habilidades em seu produto.\n" +
                "6.\t*A inclusão de produtos é um processo de ponta a ponta:* Considere a inclusão em muitos pontos " +
                "de contato, desde a ideação até o marketing.\n" +
                "7.\t*A inclusão de produtos é uma mentalidade e uma cultura:* Incentive discussões sobre inclusão e " +
                "construa produtos com usuários historicamente sub-representados.\n" +
                "O vídeo também inclui uma série de recursos para aprender mais sobre acessibilidade e " +
                "inclusão de produtos, incluindo:\n" +
                "•\tUm link para o WCAG (Web Content Accessibility Guidelines)\n" +
                "•\tUma série de vídeos sobre acessibilidade chamada Alleycasts\n" +
                "Espero que tenha gostado!\n";
    }

    @NonNull
    public static List<Integer> imgIndices() {
        List<Integer> imagens = new ArrayList<>();
        imagens.add(R.drawable.screen_jokenpo);
        imagens.add(R.drawable.relatorio_1_jokenpo);
        imagens.add(R.drawable.screen1);
        imagens.add(R.drawable.screen2);
        imagens.add(R.drawable.screen3);
        imagens.add(R.drawable.screen4);
        imagens.add(R.drawable.screen5);
        imagens.add(R.drawable.screen6);
        imagens.add(R.drawable.screen7);
        imagens.add(R.drawable.screen8);
        imagens.add(R.drawable.a11y_screen);
        imagens.add(R.drawable.relatorio_1_a11y);
        imagens.add(R.drawable.a11y_screen1);
        imagens.add(R.drawable.a11y_screen2);
        imagens.add(R.drawable.a11y_screen3);
        imagens.add(R.drawable.a11y_screen4);
        imagens.add(R.drawable.a11y_screen5);
        imagens.add(R.drawable.a11y_screen6);
        return imagens;
    }
}