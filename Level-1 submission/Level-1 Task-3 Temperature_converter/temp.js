function convertTemperature() {
    // Get input values
    var temperatureInput = parseFloat(document.getElementById("temperature").value);
    var fromUnit = document.getElementById("fromUnit").value;
    var toUnit = document.getElementById("toUnit").value;

    // Perform conversion
    var result;
    switch (fromUnit) {
        case "celsius":
            result = convertFromCelsius(temperatureInput, toUnit);
            break;
        case "fahrenheit":
            result = convertFromFahrenheit(temperatureInput, toUnit);
            break;
        case "kelvin":
            result = convertFromKelvin(temperatureInput, toUnit);
            break;
        default:
            result = "Invalid input unit";
            break;
    }

    // Display result
    document.getElementById("result").innerHTML = `Result: ${result.toFixed(2)} ${toUnit}`;
}

function convertFromCelsius(celsius, toUnit) {
    switch (toUnit) {
        case "celsius":
            return celsius;
        case "fahrenheit":
            return (celsius * 9/5) + 32;
        case "kelvin":
            return celsius + 273.15;
        default:
            return NaN;
    }
}

function convertFromFahrenheit(fahrenheit, toUnit) {
    switch (toUnit) {
        case "celsius":
            return (fahrenheit - 32) * 5/9;
        case "fahrenheit":
            return fahrenheit;
        case "kelvin":
            return (fahrenheit - 32) * 5/9 + 273.15;
        default:
            return NaN;
    }
}

function convertFromKelvin(kelvin, toUnit) {
    switch (toUnit) {
        case "celsius":
            return kelvin - 273.15;
        case "fahrenheit":
            return (kelvin - 273.15) * 9/5 + 32;
        case "kelvin":
            return kelvin;
        default:
            return NaN;
    }
}
