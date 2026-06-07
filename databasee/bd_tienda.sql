-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-06-2026 a las 02:06:15
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cod_cli` varchar(10) NOT NULL,
  `nom_cli` varchar(50) NOT NULL,
  `ape_cli` varchar(50) NOT NULL,
  `dni_cli` varchar(8) NOT NULL,
  `tel_cli` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cod_cli`, `nom_cli`, `ape_cli`, `dni_cli`, `tel_cli`) VALUES
('c001', 'jersson', 'ccenhua', '7456012', '9352656');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_factura`
--

CREATE TABLE `detalle_factura` (
  `cod_detalle` int(11) NOT NULL,
  `cantidad_ven` int(11) NOT NULL,
  `precio_ven` decimal(5,2) NOT NULL,
  `cod_fac` int(10) NOT NULL,
  `cod_pro` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `cod_fac` int(10) NOT NULL,
  `fecha_fac` date NOT NULL,
  `precio_igv_fac` decimal(7,2) NOT NULL,
  `cod_cli` varchar(10) NOT NULL,
  `Cod_log` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `Cod_log` int(11) NOT NULL,
  `Usuario_log` varchar(40) NOT NULL,
  `Password_log` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`Cod_log`, `Usuario_log`, `Password_log`) VALUES
(1, 'admin', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `cod_pro` varchar(20) NOT NULL,
  `nombre_pro` varchar(50) NOT NULL,
  `precio_pro` decimal(5,2) NOT NULL,
  `stock_pro` int(3) NOT NULL,
  `descripcion_pro` varchar(500) NOT NULL,
  `categoria_pro` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`cod_pro`, `nombre_pro`, `precio_pro`, `stock_pro`, `descripcion_pro`, `categoria_pro`) VALUES
('A001', 'Casino', 2.50, 15, 'Prontos a vencer', 'snacks'),
('C001', 'producto', 3.20, 20, 'fadfdafa', 'bebidas'),
('P001', 'clorox', 3.50, 6, 'producto de limpieza', 'limpieza'),
('p002', 'chetos', 1.50, 19, 'fdfdfgdfgdfggd', 'snacks');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cod_cli`);

--
-- Indices de la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  ADD PRIMARY KEY (`cod_detalle`),
  ADD KEY `cod_fac` (`cod_fac`),
  ADD KEY `cod_pro` (`cod_pro`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`cod_fac`),
  ADD KEY `cod_cli` (`cod_cli`),
  ADD KEY `Cod_log` (`Cod_log`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Cod_log`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`cod_pro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  MODIFY `cod_detalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `cod_fac` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `Cod_log` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  ADD CONSTRAINT `detalle_factura_ibfk_1` FOREIGN KEY (`cod_pro`) REFERENCES `producto` (`cod_pro`),
  ADD CONSTRAINT `detalle_factura_ibfk_2` FOREIGN KEY (`cod_fac`) REFERENCES `factura` (`cod_fac`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`cod_cli`) REFERENCES `cliente` (`cod_cli`),
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`Cod_log`) REFERENCES `login` (`Cod_log`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
