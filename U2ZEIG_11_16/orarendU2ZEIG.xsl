<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
    <xsl:template match = "/">
        <html>
            <body>
                <h1>Juhász Balázs órarend – 2021/22. I. félév.</h1>

                <table border = "2">
                    <tr bgcolor = "green">
                        <th>ID</th>
                        <th>Tárgy</th>
                        <th>Időpont</th>
                        <th>Helyszin</th>
                        <th>Oktato</th>
                        <th>Szak</th>
                    </tr>
                    <xsl:for-each select="orarend/ora">

                        <tr bgcolor="">
                            <td>
                                <xsl:value-of select = "@id"/>
                            </td>
                            <td><xsl:value-of select = "targy"/></td>
                            <td><xsl:value-of select = "idopont"/></td>
                            <td><xsl:value-of select = "helyszin"/></td>
                            <td><xsl:value-of select = "oktato"/></td>
                            <td><xsl:value-of select = "szak"/></td>
                        </tr>
                    </xsl:for-each>



                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>