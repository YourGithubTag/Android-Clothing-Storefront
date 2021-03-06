package com.example.apparelmarket.models;
import com.example.apparelmarket.R;
import java.util.ArrayList;

public class ApparelProvider {

    public static ArrayList<ApparelItem> dataArray = new ArrayList<ApparelItem>();

    static int[] itemViews = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    static String[] itemIDs = {
            "001", "002", "003", "004", "005", "006", "007", "008", "009", "010",
            "011", "012", "013", "014", "015", "016", "017", "018", "019", "020",
            "021", "022", "023", "024", "025", "026", "027", "028", "029", "030"
    };

    static String[] itemCategories = {
            "Chinos", "Chinos", "Chinos", "Chinos", "Chinos", "Chinos", "Chinos", "Chinos", "Chinos", "Chinos",
            "Shirt", "Shirt", "Shirt", "Shirt", "Shirt", "Shirt", "Shirt", "Shirt", "Shirt", "Shirt",
            "Shoes", "Shoes", "Shoes", "Shoes", "Shoes", "Shoes", "Shoes", "Shoes", "Shoes", "Shoes"
    };

    static String[] itemPrices = {
            "$69.99", "$49.99", "$199.99", "$79.99", "$48.99", "$39.99", "$93.99", "$53.99", "$45.99", "$95.99",
            "$36.99", "$24.99", "$26.99", "$63.99", "$62.99", "$67.99", "$46.99", "$24.99", "$31.99", "$24.99",
            "$499.99", "$122.99", "$144.99", "$69.99", "$142.99", "$299.99", "$219.99", "$109.99", "$79.99", "$399.99"
    };

    static String[] itemNames = {
            "boohooMAN tartan trouser", "New Look slim chinos", "Ted Baker slim fit trousers", "Only & Sons drawstring trousers", "Burton Menswear skinny trousers",
            "Celio slim trousers", "Weekday Tucker Trousers", "Only & Sons stretch trouser", "JN Design 2 pack skinny chinos", "Nike Pro Training tights",

            "PS Paul Smith patchwork pocket shirt", "Armani Exchange long sleeve shirt", "AllSaints revere collar shirt", "Polo Ralph Lauren oxford shirt", "Tommy Hilfiger oxford shirt",
            "Celio shirt in linen", "JN Design relaxed fit linen shirt", "JN Design stretch skinny fit shirt", "JN Design regular fit sheer shirt", "Pull&Bear shirt with aztec print",

            "Bronx seventy street trainers", "Nike Running Renew Run trainers", "Fred Perry Deuce leather trainers", "Vans Anaheim Old Skool trainer", "Converse Chuck Taylor Tie Dye trainer",
            "Dr Martens jadon platform boots", "Nike Running Joyride trainers", "Burton Menswear leather boot", "JN Design slip ons", "Nike Air Max 2090 trainers"
    };


    static String[] itemDetails = {
            "An alternative to your denim. Tartan check design. Belt loops.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Soft woven fabric. It's got a little stretch.",
            "Chinos by New Look. Give your jeans a day off. Regular rise. Belt loops.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Soft, stretch twill. Semi-structured fabric with a parallel-rib pattern.",
            "Trousers by Ted Baker. A little bit smart. Zip fly with button fastening. Side pockets.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Soft, stretch twill. Semi-structured fabric with a parallel-rib pattern.",
            "Trousers by Only & Sons. For your everyday thing. Regular rise. Drawstring waist.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Soft fabric. Slightly stretchy.",
            "Chinos by Burton Menswear London. A little bit smart. Checked design. Belt loops.\n\n" +
                    "Model's height: 188cm/6'2\".\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Smooth woven fabric. It's got a little stretch.",
            "Trousers by Celio. A little bit smart. Regular rise. Concealed fly with button fastening.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Textured woven fabric. It's got a little stretch.",
            "Trousers by Weekday. Part of our responsible edit. Belt loops. Zip fly with button fastening.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Lightweight woven fabric. Made from organic cotton.",
            "Trousers by Only & Sons. Coming soon to your Saved Items. Pinstripe design. Zip fly with button fastening.\n\n" +
                    "Model's height: 6'2”/188 cm.\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Lightweight woven fabric. The kind that stretches.",
            "Chinos multipack by JN Design. Part of our responsible edit. Pack of two pairs. Belt loops.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Soft woven fabric. It's got a little stretch.",
            "Tights by Nike. Elasticated waistband. Nike Pro branding.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: W 32\" L 32\".\n\n" +
                    "Tight, stretchy Nike Pro fabric. Uses Nike Dri-FIT technology.",
            "Shirt by PS Paul Smith. Casual, meet smart. Long sleeves. Button placket.\n\n" +
                    "Model's height: 183cm/6'0\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Lightweight cotton. Soft, strong and breathable.",
            "Shirt by Armani Exchange. For your everyday thing. All-over logo print. Spread collar. Button placket.\n\n" +
                    "Model's height: 183cm/6'0\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Crisp woven cotton. Its got a little stretch.",
            "Shirt by AllSaints. For your daytime thing. Revere collar. Button placket.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Lightweight viscose. Soft and drapey.",
            "Shirt by Polo Ralph Lauren. Part of our responsible edit. Striped design. Button-down collar.\n\n" +
                    "Model's height: 187.5cm/6'2\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Lightweight cotton. Polo Ralph Lauren partners with the Better Cotton Initiative to improve cotton farming globally.",
            "Oxford shirt by Tommy Hilfiger. Breathable cotton. Button-down collar. Embroidered logo.\n\n" +
                    "Model's height: 6'2”/188 cm.\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Main: 98% Cotton, 2% Elastane.",
            "Shirt by Celio. Spread collar. Button placket. Chest pocket.\n\n" +
                    "Model's height: 183cm/6'2.5\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Lightweight linen. Strong, breathable fabric.",
            "Shirt by JN Design. Revere collar. Short sleeves. Plain design.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Linen-rich fabric. It's strong and breathable.",
            "Shirt by JN Design. Part of our responsible edit. Spread collar. Button placket.\n\n" +
                    "Model's height: 178cm/5'10\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Lightweight cotton. Soft, strong and breathable.",
            "Shirt by JN Design. Let your outfit do the talking. Animal print. Notch lapels.\n\n" +
                    "Model's height: 187.5cm/6'2\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Lightweight, woven fabric. For those see-through vibes.",
            "Shirt by Pull&Bear. Not every day's a T-shirt day. All-over Aztec print. Revere collar.\n\n" +
                    "Model's height: 185.5cm/6'1\".\n" +
                    "Model is wearing: Size Medium.\n\n" +
                    "Lightweight woven fabric. Soft and drapey.",
            "Trainers by Bronx. Unboxing potential: considerable. Graffiti print. Lace-up fastening.\n\n" +
                    "Matte leather upper. Leather lining.",
            "Trainers by Nike. Elevate your run. Lace-up fastening\n\n" +
                    "Padded tongue and cuffs for comfort.\n" +
                    "Breathable mesh upper. Keeps them fresher for longer.",
            "Trainers by Fred Perry. Unboxing potential: considerable. Low-profile design. Lace-up fastening.\n\n" +
                    "Smooth leather upper. Matte finish.",
            "Trainers by Vans. Unboxing potential: considerable. Colour-block design. Lace-up fastening.\n\n" +
                    "Canvas upper. Durable, plain-woven fabric.",
            "Trainers by Converse. Unboxing potential: considerable . Tie-dye finish. Lace-up design.\n\n" +
                    "Lightly textured canvas upper. Durable, plain-woven fabric.",
            "Boots by Dr Martens. Zip and lace-up fastening. Round toe.\n\n" +
                    "Smooth leather upper. Glossy, patent finish.",
            "Trainers by Nike. Elevate your run. Lace-up fastening. Nike Swoosh logo.\n\n" +
                    "Breathable mesh upper. Smooth overlays.",
            "Boots by Burton Menswear London. Your rain-or-shine shoes. Elasticated inserts. Pull tabs.\n\n" +
                    "Leather and suede upper. Matte finish.",
            "Espadrilles by JN Design. Who needs the back of a shoe anyway? Slip-on style. Gold-tone snaffle detail.\n\n" +
                    "Soft suede upper. Fuzzy, velvety finish.",
            "Trainers by Nike. Lace-up design. Pull tabs for easy on/off.\n\n" +
                    "Knitted upper. Comfy, sock-like fit."
    };

    static int[] itemImageAddrs = {
            R.drawable.chinos_1_1, R.drawable.chinos_1_2, R.drawable.chinos_1_3, R.drawable.chinos_2_1, R.drawable.chinos_2_2, R.drawable.chinos_2_3, R.drawable.chinos_3_1, R.drawable.chinos_3_2, R.drawable.chinos_3_3, R.drawable.chinos_4_1, R.drawable.chinos_4_2, R.drawable.chinos_4_3, R.drawable.chinos_5_1, R.drawable.chinos_5_2, R.drawable.chinos_5_3,
            R.drawable.chinos_6_1, R.drawable.chinos_6_2, R.drawable.chinos_6_3, R.drawable.chinos_7_1, R.drawable.chinos_7_2, R.drawable.chinos_7_3, R.drawable.chinos_8_1, R.drawable.chinos_8_2, R.drawable.chinos_8_3, R.drawable.chinos_9_1, R.drawable.chinos_9_2, R.drawable.chinos_9_3, R.drawable.chinos_10_1, R.drawable.chinos_10_2, R.drawable.chinos_10_3,

            R.drawable.shirt_1_1, R.drawable.shirt_1_2, R.drawable.shirt_1_3, R.drawable.shirt_2_1, R.drawable.shirt_2_2, R.drawable.shirt_2_3, R.drawable.shirt_3_1, R.drawable.shirt_3_2, R.drawable.shirt_3_3, R.drawable.shirt_4_1, R.drawable.shirt_4_2, R.drawable.shirt_4_3, R.drawable.shirt_5_1, R.drawable.shirt_5_2, R.drawable.shirt_5_3,
            R.drawable.shirt_6_1, R.drawable.shirt_6_2, R.drawable.shirt_6_3, R.drawable.shirt_7_1, R.drawable.shirt_7_2, R.drawable.shirt_7_3, R.drawable.shirt_8_1, R.drawable.shirt_8_2, R.drawable.shirt_8_3, R.drawable.shirt_9_1, R.drawable.shirt_9_2, R.drawable.shirt_9_3, R.drawable.shirt_10_1, R.drawable.shirt_10_2, R.drawable.shirt_10_3,

            R.drawable.shoes_1_1, R.drawable.shoes_1_2, R.drawable.shoes_1_3, R.drawable.shoes_2_1, R.drawable.shoes_2_2, R.drawable.shoes_2_3, R.drawable.shoes_3_1, R.drawable.shoes_3_2, R.drawable.shoes_3_3, R.drawable.shoes_4_1, R.drawable.shoes_4_2, R.drawable.shoes_4_3, R.drawable.shoes_5_1, R.drawable.shoes_5_2, R.drawable.shoes_5_3,
            R.drawable.shoes_6_1, R.drawable.shoes_6_2, R.drawable.shoes_6_3, R.drawable.shoes_7_1, R.drawable.shoes_7_2, R.drawable.shoes_7_3, R.drawable.shoes_8_1, R.drawable.shoes_8_2, R.drawable.shoes_8_3, R.drawable.shoes_9_1, R.drawable.shoes_9_2, R.drawable.shoes_9_3, R.drawable.shoes_10_1, R.drawable.shoes_10_2, R.drawable.shoes_10_3
    };


    public static void generateData() {
        ArrayList<ApparelItem> apparelItemslist = new ArrayList<ApparelItem>();

        for (int i = 0; i < 30; i++) {
            String idIN = itemIDs[i];
            String itemCategoryIN = itemCategories[i];
            String itemPriceIN = itemPrices[i];
            String itemNameIN = itemNames[i];
            String itemDetailIN = itemDetails[i];
            int itemImageIN[] = new int[3];
            int itemViewIN = itemViews[i];

            if (i == 0) {
                itemImageIN[0] = itemImageAddrs[i];
                itemImageIN[1] = itemImageAddrs[i + 1];
                itemImageIN[2] = itemImageAddrs[i + 2];
            } else {
                itemImageIN[0] = itemImageAddrs[3 * i];
                itemImageIN[1] = itemImageAddrs[3 * i + 1];
                itemImageIN[2] = itemImageAddrs[3 * i + 2];
            }

            ApparelItem ApparelItemIN = new ApparelItem(idIN, itemCategoryIN, itemPriceIN, itemNameIN, itemDetailIN, itemImageIN, itemViewIN);
            apparelItemslist.add(ApparelItemIN);
        }
        dataArray = apparelItemslist;
    }
}
