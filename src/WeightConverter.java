public class WeightConverter<T extends Number> {
    // kg to ...

    public double kilogramToGram(T kilogram) {
        return kilogram.doubleValue() * 1000;
    }

    public double kilogramToKilogram(T kilogram) {
        return kilogram.doubleValue();
    }

    public double kilogramToMilligram(T kilogram) {
        return kilogram.doubleValue() * 1000000;
    }

    public double kilogramToMetricTon(T kilogram) {
        return kilogram.doubleValue() * 0.001;
    }

    public double kilogramToLongTon(T kilogram) {
        return kilogram.doubleValue() * 0.000984207;
    }

    public double kilogramToShortTon(T kilogram) {
        return kilogram.doubleValue() * 0.00110231;
    }

    public double kilogramToPound(T kilogram) {
        return kilogram.doubleValue() * 2.20462;
    }

    public double kilogramToOunce(T kilogram) {
        return kilogram.doubleValue() * 35.27396;
    }

    public double kilogramToCarat(T kilogram) {
        return kilogram.doubleValue() * 5000;
    }

    // gram to ....

    public double gramToKilogram(T gram) {
        return gram.doubleValue() / 1000;
    }

    public double gramToMilligram(T gram) {
        return gram.doubleValue() * 1000;
    }

    public double gramToGram(T gram) {
        return gram.doubleValue();
    }

    public double gramToMetricTon(T gram) {
        return gram.doubleValue() / 1000000;
    }

    public double gramToShortTon(T gram) {
        return gram.doubleValue() / 907184.74;
    }

    public double gramToLongTon(T gram) {
        return gram.doubleValue() / 1016046.91;
    }

    public double gramToPound(T gram) {
        return gram.doubleValue() / 453.59237;
    }

    public double gramToOunce(T gram) {
        return gram.doubleValue() / 28.34952;
    }

    public double gramToCarat(T gram) {
        return gram.doubleValue() * 5;
    }

    // milligram to ...

    public double milligramToMilligram(T milligram) {
        return milligram.doubleValue();
    }

    public double milligramToGram(T milligram) {
        return milligram.doubleValue() * 0.001;
    }

    public double milligramToKilogram(T milligram) {
        return milligram.doubleValue() * 0.000001;
    }

    public double milligramToShortTon(T milligram) {
        return milligram.doubleValue() * 2.20462e-9;
    }

    public double milligramToLongTon(T milligram) {
        return milligram.doubleValue() * 1.96841e-9;
    }

    public double milligramToOunce(T milligram) {
        return milligram.doubleValue() * 0.00003527396;
    }

    public double milligramToPound(T milligram) {
        return milligram.doubleValue() * 0.00000220462;
    }

    public double milligramToCarat(T milligram) {
        return milligram.doubleValue() * 0.0002;
    }
    public double milligramToMetricTon(T milligram) {
        return milligram.doubleValue() * 0.000001;
    }
    
    // metric ton to ...

    public double metricTonToKilogram(T metricTon) {
        return metricTon.doubleValue() * 1000;
    }

    public double metricTonToGram(T metricTon) {
        return metricTon.doubleValue() * 1000000;
    }

    public double metricTonToMetricTon(T metricTon) {
        return metricTon.doubleValue();
    }

    public double metricTonToLongTon(T metricTon) {
        return metricTon.doubleValue() * 1.9684e-9;
    }

    public double metricTonToShortTon(T metricTon) {
        return metricTon.doubleValue() * 2.2046e-9;
    }

    public double metricTonToOunce(T metricTon) {
        return metricTon.doubleValue() * 35273.96;
    }

    public double metricTonToPound(T metricTon) {
        return metricTon.doubleValue() * 2204.62;
    }

    public double metricTonToMilligram(T metricTon) {
        return metricTon.doubleValue() * 1000000000;
    }

    public double metricTonToCarat(T metricTon) {
        return metricTon.doubleValue() * 5000000;
    }

    // short ton to ...

    public double shortTonToShortTon(T shortTon) {
        return shortTon.doubleValue();
    }

    public double shortTonToKilogram(T shortTon) {
        return shortTon.doubleValue() * 907.185;
    }

    public double shortTonToGram(T shortTon) {
        return shortTon.doubleValue() * 907185;
    }

    public double shortTonToMilligram(T shortTon) {
        return shortTon.doubleValue() * 907185000;
    }

    public double shortTonToLongTon(T shortTon) {
        return shortTon.doubleValue() * 0.892857;
    }

    public double shortTonToMetricTon(T shortTon) {
        return shortTon.doubleValue() * 0.907185;
    }

    public double shortTonToPound(T shortTon) {
        return shortTon.doubleValue() * 2000;
    }

    public double shortTonToOunce(T shortTon) {
        return shortTon.doubleValue() * 32000;
    }

    public double shortTonToCarat(T shortTon) {
        return shortTon.doubleValue() * 14285714.29;
    }

    // long ton to ...

    public double longTonToLongTon(T longTon) {
        return longTon.doubleValue();
    }

    public double longTonToKilogram(T longTon) {
        return longTon.doubleValue() * 1016046.9088;
    }

    public double longTonToGram(T longTon) {
        return longTon.doubleValue() * 1016046908800.0;
    }

    public double longTonToMilligram(T longTon) {
        return longTon.doubleValue() * 1016046908800000.0;
    }

    public double longTonToMetricTon(T longTon) {
        return longTon.doubleValue() * 1.016;
    }

    public double longTonToShortTon(T longTon) {
        return longTon.doubleValue() * 1.12;
    }

    public double longTonToPound(T longTon) {
        return longTon.doubleValue() * 2240;
    }

    public double longTonToOunce(T longTon) {
        return longTon.doubleValue() * 35840;
    }

    public double longTonToCarat(T longTon) {
        return longTon.doubleValue() * 16000000;
    }

    // pound to ...

    public double poundToPound(T pound) {
        return pound.doubleValue();
    }

    public double poundToKilogram(T pound) {
        return pound.doubleValue() * 0.453592;
    }

    public double poundToGram(T pound) {
        return pound.doubleValue() * 453.592;
    }

    public double poundToMilligram(T pound) {
        return pound.doubleValue() * 453592;
    }

    public double poundToMetricTon(T pound) {
        return pound.doubleValue() * 0.000453592;
    }

    public double poundToShortTon(T pound) {
        return pound.doubleValue() * 0.0005;
    }

    public double poundToLongTon(T pound) {
        return pound.doubleValue() * 0.000446429;
    }

    public double poundToOunce(T pound) {
        return pound.doubleValue() * 16;
    }

    public double poundToCarat(T pound) {
        return pound.doubleValue() * 2267.96;
    }

    // Ounce to ...

    public double ounceToOunce(T ounce) {
        return ounce.doubleValue();
    }

    public double ounceToKilogram(T ounce) {
        return ounce.doubleValue() * 0.0283495;
    }

    public double ounceToGram(T ounce) {
        return ounce.doubleValue() * 28.3495;
    }

    public double ounceToMilligram(T ounce) {
        return ounce.doubleValue() * 28349.5;
    }

    public double ounceToMetricTon(T ounce) {
        return ounce.doubleValue() * 0.0000283495;
    }

    public double ounceToShortTon(T ounce) {
        return ounce.doubleValue() * 0.00003125;
    }

    public double ounceToLongTon(T ounce) {
        return ounce.doubleValue() * 0.0000279018;
    }

    public double ounceToCarat(T ounce) {
        return ounce.doubleValue() * 141.747;
    }

    public double ounceToPound(T ounce) {
        return ounce.doubleValue() * 0.0625;
    }

    // carat to ...

    public double caratToCarat(T carat) {
        return carat.doubleValue();
    }

    public double caratToKilogram(T carat) {
        return carat.doubleValue() * 0.0002;
    }

    public double caratToGram(T carat) {
        return carat.doubleValue() * 0.2;
    }

    public double caratToMilligram(T carat) {
        return carat.doubleValue() * 200;
    }

    public double caratToLongTon(T carat) {
        return carat.doubleValue() * 1.96841e-7;
    }

    public double caratToShortTon(T carat) {
        return carat.doubleValue() * 2.20462e-7;
    }

    public double caratToMetricTon(T carat) {
        return carat.doubleValue() * 2e-7;
    }

    public double caratToPound(T carat) {
        return carat.doubleValue() * 0.000440925;
    }

    public double caratToOunce(T carat) {
        return carat.doubleValue() * 0.007055;
    }

    /*************************************************************************************
     ************************** Length Conversion******************************************
     *************************************************************************************/

    // Kilometre to other units
    public double KilometretoMetre(T kilometre) {
        return kilometre.doubleValue() * 1000;
    }

    public double kilometretoCentimetre(T kilometre) {
        return kilometre.doubleValue() * 100000;
    }

    public double kilometretoMillimetre(T kilometre) {
        return kilometre.doubleValue() * 1000000000;
    }

    public double kilometretoInch(T kilometre) {
        return kilometre.doubleValue() * 39370.0787;
    }

    public double kilometretoFeet(T Kilometre) {
        return Kilometre.doubleValue() * 3280.84;
    }

    public double kilometretoYard(T kilometre) {
        return kilometre.doubleValue() * 1093.61;
    }

    // Metre to Other Units
    public double metretoKilometer(T metre) {
        return metre.doubleValue() / 1000;
    }

    public double metretoCentimeter(T metre) {
        return metre.doubleValue() * 100;
    }

    public double metretoMillimeter(T metre) {
        return metre.doubleValue() * 1000;
    }

    public double metretoInch(T metre) {
        return metre.doubleValue() * 39.37;
    }

    public double metretoFeet(T metre) {
        return metre.doubleValue() * 3.281;
    }

    public double metretoYard(T metre) {
        return metre.doubleValue() * 1.094;
    }

    // Centimetre to other units

    public double centimetreToMeter(T centimeter) {
        return centimeter.doubleValue() / 100;
    }

    public double centimetreToMicrometer(T centimeter) {
        return centimeter.doubleValue() * 10000;
    }

    public double centimetreToInches(T centimeter) {
        return centimeter.doubleValue() / 2.54;
    }

    public double centimetreToKilometer(T centimeter) {
        return centimeter.doubleValue() / 100000;
    }

    public double centimetreToFeet(T centimetre) {
        return centimetre.doubleValue() * 0.0328084;
    }

    public double centimetretoYard(T centimetre) {
        return centimetre.doubleValue() * 0.0109361;
    }

    // micrometer to other units

    public double micrometerToKilometer(T micrometer) {
        return micrometer.doubleValue() / 1000000000.0;
    }

    public double micrometerToCentimeter(T micrometer) {
        return micrometer.doubleValue() / 10000.0;
    }

    public double micrometerToMeter(T micrometer) {
        return micrometer.doubleValue() / 1000000.0;
    }

    public double micrometerToInch(T micrometer) {
        return micrometer.doubleValue() / 25400.0;
    }

    public double micrometerToFeet(T micrometer) {
        return micrometer.doubleValue() * 0.000003281;
    }

    public double micrometerToYard(T micrometer) {
        return micrometer.doubleValue() * 0.000001094;
    }
    // inch to other units

    public double inchToKilometre(T inch) {
        return inch.doubleValue() * 0.0000254;
    }

    public double inchToMetre(T inch) {
        return inch.doubleValue() * 0.0254;
    }

    public double inchToCentimetre(T inch) {
        return inch.doubleValue() * 2.54;
    }

    public double inchToMicrometre(T inch) {
        return inch.doubleValue() * 25400;
    }

    public double inchToFeet(T inch) {
        return inch.doubleValue() / 12;
    }

    public double inchToyard(T inch) {
        return inch.doubleValue() * 36;
    }

    // Feet to other units
    public double feetTokilometer(T feet) {
        return feet.doubleValue() * 000304;
    }

    public double feetToMetre(T feet) {
        return feet.doubleValue() * 0.3048;
    }

    public double feetToCentimetre(T feet) {
        return feet.doubleValue() * 30.48;
    }

    public double feetToMicrometre(T feet) {
        return feet.doubleValue() * 304800;
    }

    public double feetToInch(T feet) {
        return feet.doubleValue() * 12;
    }

    public double feetToYard(T feet) {
        return feet.doubleValue() / 3;
    }

    // yard to otherunits
    public double yardToKilometer(T yard) {
        return yard.doubleValue() * 0.0009144;
    }

    public double yardtoMetre(T yard) {
        return yard.doubleValue() * 9144;
    }

    public double yardToCentimetre(T yard) {
        return yard.doubleValue() * 91.44;
    }

    public double yardToMicrometre(T yard) {
        return yard.doubleValue() * 914400;
    }

    public double yardToInch(T yard) {
        return yard.doubleValue() * 36;
    }

    public double yardToFeet(T yard) {
        return yard.doubleValue() * 3;
    }

    /*********************************************************************************
     * **************************Liquid
     * Conversion***********************************
     *********************************************************************************/
    public double millilitretoMillilitre(T millilitre) {
        return millilitre.doubleValue();
    }

    public double millilitretoLitre(T millilitre) {
        return millilitre.doubleValue() / 1000;
    }

    public double millilitretoBarrel(T millilitre) {
        return millilitre.doubleValue() / 158987.295;
    }

    public double millilitretoPeck(T millilitre) {
        return millilitre.doubleValue() / 908.082984;
    }

    public double millilitretoPointdry(T millilitre) {
        return millilitre.doubleValue() / 14.646;
    }

    public double millilitretoQuartdry(T millilitre) {
        return millilitre.doubleValue() / 946.353;
    }

    // Litre to ...

    public double litretoLitre(T litre) {
        return litre.doubleValue();
    }

    public double litretoMillilitre(T litre) {
        return litre.doubleValue() * 100;
    }

    public double litretoBarrel(T litre) {
        return litre.doubleValue() * 0.00628981;
    }

    public double litretoPeck(T litre) {
        return litre.doubleValue() * 1.10122095;
    }

    public double litretoPointdry(T litre) {
        return litre.doubleValue() * 68.2743419;
    }

    public double litretoQuartdry(T litre) {
        return litre.doubleValue() * 1.05668821;
    }

    // Barrel to ...

    public double barreltoBarrel(T barrel) {
        return barrel.doubleValue();
    }

    public double barreltomillilitre(T barrel) {
        return barrel.doubleValue() * 158987.295;
    }

    public double barreltolitre(T barrel) {
        return barrel.doubleValue() * 158.987295;
    }

    public double barreltoPeck(T barrel) {
        return barrel.doubleValue() * 289.139227;
    }

    public double barreltoPointdry(T barrel) {
        return barrel.doubleValue() * 10368;
    }

    public double barreltoQuartdry(T barrel) {
        return barrel.doubleValue() * 2113.37642;
    }

    // Peck to ...

    public double pecktoLitre(T pecks) {
        return pecks.doubleValue() * 9.09218;
    }

    public double pecktoMillilitre(T pecks) {
        return pecks.doubleValue() * 9092.18;
    }

    public double pecktoBarrel(T pecks) {
        return pecks.doubleValue() * 0.344792;
    }

    public double pecktoPointDry(T pecks) {
        return pecks.doubleValue() * 327.368736;
    }

    public double pecktoQuartDry(T pecks) {
        return pecks.doubleValue() * 81.842184;
    }

    public double pecktoPeck(T pecks) {
        return pecks.doubleValue();
    }

    // Point dry

    public double pointDrytoPointdry(T pointsDry) {
        return pointsDry.doubleValue();
    }

    public double pointDrytoPeck(T pointsDry) {
        return pointsDry.doubleValue() / 327.368736;
    }

    public double pointDrytoLitre(T pointsDry) {
        return pointsDry.doubleValue() / 36.3773242;
    }

    public double pointDrytoMillilitere(T pointsDry) {
        return pointsDry.doubleValue() / 0.0363773242;
    }

    public double pointDrytoBarrel(T pointsDry) {
        return pointsDry.doubleValue() / 9525.5;
    }

    public double pointDrytoQuartdry(T pointsDry) {
        return pointsDry.doubleValue() / 4.8082;
    }

    // Quart dry to ...

    public double quartdrytoQuartdry(T quartsDry) {
        return quartsDry.doubleValue();
    }

    public double quartdrytoPeck(T quartsDry) {
        return quartsDry.doubleValue() / 4.8082;
    }

    public double quartdrytoLitre(T quartsDry) {
        return quartsDry.doubleValue() / 1.10122095;
    }

    public double quartdrytoMillilitre(T quartsDry) {
        return quartsDry.doubleValue() / 0.00110122095;
    }

    public double quartdrytoBarrel(T quartsDry) {
        return quartsDry.doubleValue() / 84.131586;
    }

    public double quartdrytoPointdry(T quartsDry) {
        return quartsDry.doubleValue() * 194.210514;
    }

}
